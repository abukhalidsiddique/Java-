/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mealmanagementapp;

/**
 *
 * @author Path Finder
 */
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class MealManagementApp extends Application {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/meal_management";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    private TableView<Student> studentTable;
    private ObservableList<Student> studentData;
    private Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        mainStage = primaryStage;

        // Show login page initially
        showLoginPage();
    }

    // Login Page
    private void showLoginPage() {
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> login(usernameField.getText(), passwordField.getText()));

        Button signupButton = new Button("Signup");
        signupButton.setOnAction(e -> showSignupPage());

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(new Label("Username:"), 0, 0);
        grid.add(usernameField, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(passwordField, 1, 1);
        grid.add(loginButton, 1, 2);
        grid.add(signupButton, 1, 3);

        Scene scene = new Scene(grid, 400, 250);
        mainStage.setTitle("Admin Login");
        mainStage.setScene(scene);
        mainStage.show();
    }

    // Signup Page
    private void showSignupPage() {
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        Button signupButton = new Button("Signup");
        signupButton.setOnAction(e -> signup(usernameField.getText(), passwordField.getText()));

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(new Label("Username:"), 0, 0);
        grid.add(usernameField, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(passwordField, 1, 1);
        grid.add(signupButton, 1, 2);

        Scene scene = new Scene(grid, 400, 250);
        mainStage.setTitle("Admin Signup");
        mainStage.setScene(scene);
        mainStage.show();
    }

    // Admin login validation
    private void login(String username, String password) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    showMainApp();
                } else {
                    showError("Invalid username or password!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Admin signup
    private void signup(String username, String password) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String sql = "INSERT INTO admin (username, password) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.executeUpdate();
                showSuccess("Signup successful! You can now login.");
                showLoginPage();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Show error message
    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Show success message
    private void showSuccess(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Main Application (after successful login)
    private void showMainApp() {
        studentTable = new TableView<>();
        studentData = FXCollections.observableArrayList();

        TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));

        TableColumn<Student, String> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));

        TableColumn<Student, Double> initialPaymentColumn = new TableColumn<>("Initial Payment");
        initialPaymentColumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getInitialPayment()).asObject());

        TableColumn<Student, Double> balanceColumn = new TableColumn<>("Balance");
        balanceColumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getBalance()).asObject());

        studentTable.getColumns().add(nameColumn);
        studentTable.getColumns().add(idColumn);
        studentTable.getColumns().add(initialPaymentColumn);
        studentTable.getColumns().add(balanceColumn);

        Button loadButton = new Button("Load Students");
        loadButton.setOnAction(e -> loadStudents());

        Button addButton = new Button("Add Student");
        addButton.setOnAction(e -> addStudent());

        Button calculateButton = new Button("Calculate Balances");
        calculateButton.setOnAction(e -> calculateBalances());

        VBox vbox = new VBox(10, loadButton, addButton, calculateButton, studentTable);
        vbox.setPadding(new Insets(10));

        Scene scene = new Scene(vbox, 600, 400);
        mainStage.setScene(scene);
        mainStage.show();
    }

    // Load students from database
    private void loadStudents() {
        studentData.clear();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {

            while (resultSet.next()) {
                String name = resultSet.getString("student_name");
                String id = resultSet.getString("student_id");
                double initialPayment = resultSet.getDouble("initial_payment");
                double balance = resultSet.getDouble("balance");
                studentData.add(new Student(name, id, initialPayment, balance));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        studentTable.setItems(studentData);
    }

    // Add a new student to the database
    private void addStudent() {
        TextField nameField = new TextField();
        TextField idField = new TextField();
        TextField emailField = new TextField();

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(new Label("Name:"), 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(new Label("Student ID:"), 0, 1);
        grid.add(idField, 1, 1);
        grid.add(new Label("Email:"), 0, 2);
        grid.add(emailField, 1, 2);

        Button submitButton = new Button("Add Student");
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String id = idField.getText();
            String email = emailField.getText();

            addStudentToDatabase(name, id, email);
            loadStudents();
        });

        grid.add(submitButton, 1, 3);

        Scene scene = new Scene(grid, 400, 250);
        mainStage.setScene(scene);
    }

    // Insert a new student into the database
    private void addStudentToDatabase(String name, String id, String email) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String sql = "INSERT INTO students (student_name, student_id, email, initial_payment) VALUES (?, ?, ?, 2500)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, id);
                preparedStatement.setString(3, email);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Calculate balances based on total cost, total meal, and individual meal input
    private void calculateBalances() {
        // Show a dialog to input total cost and total meals
        TextInputDialog costDialog = new TextInputDialog();
        costDialog.setTitle("Enter Total Cost");
        costDialog.setHeaderText("Enter the total cost for the month:");
        costDialog.showAndWait();
        double totalCost = Double.parseDouble(costDialog.getResult());

        TextInputDialog mealDialog = new TextInputDialog();
        mealDialog.setTitle("Enter Total Meals");
        mealDialog.setHeaderText("Enter the total meals for the month:");
        mealDialog.showAndWait();
        int totalMeals = Integer.parseInt(mealDialog.getResult());

        double mealRate = totalCost / totalMeals;

        // Now show a dialog for each student to input their meal consumption
        for (Student student : studentData) {
            TextInputDialog mealInputDialog = new TextInputDialog();
            mealInputDialog.setTitle("Enter Meals for " + student.getName());
            mealInputDialog.setHeaderText("Enter total meals consumed by " + student.getName() + ":");
            mealInputDialog.showAndWait();
            int mealsConsumed = Integer.parseInt(mealInputDialog.getResult());

            double balance = student.getInitialPayment() - (mealsConsumed * mealRate);
            updateStudentBalance(student.getId(), balance);
        }

        loadStudents();
    }

    // Update the balance of a student
    private void updateStudentBalance(String id, double balance) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String sql = "UPDATE students SET balance = ? WHERE student_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setDouble(1, balance);
                preparedStatement.setString(2, id);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Student class to hold student details
    public static class Student {
        private String name;
        private String id;
        private double initialPayment;
        private double balance;

        public Student(String name, String id, double initialPayment, double balance) {
            this.name = name;
            this.id = id;
            this.initialPayment = initialPayment;
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public double getInitialPayment() {
            return initialPayment;
        }

        public double getBalance() {
            return balance;
        }
    }
}
