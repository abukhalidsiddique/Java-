package com.mycompany.smartcampusmanagementsystem;


import java.util.*;


// Student Class
class Student {
    private String id;
    private String name;
    private String department;
    private List<String> courses;

    public Student(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Courses: " + courses;
    }
}

// Student Manager
class StudentManager {
    private Map<String, Student> students;

    public StudentManager() {
        this.students = new HashMap<>();
    }

    public void manageStudents(Scanner scanner) {
        while (true) {
            System.out.println("\nStudent Management");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        if (students.containsKey(id)) {
            System.out.println("Student with this ID already exists.");
        } else {
            students.put(id, new Student(id, name, department));
            System.out.println("Student added successfully.");
        }
    }

    private void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }

    private void deleteStudent(Scanner scanner) {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();

        if (students.remove(id) != null) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public Student getStudentById(String id) {
        return students.get(id);
    }
}

// Course Manager
class CourseManager {
    private List<String> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    public void manageCourses(Scanner scanner, StudentManager studentManager) {
        while (true) {
            System.out.println("\nCourse Management");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Assign Course to Student");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCourse(scanner);
                    break;
                case 2:
                    viewCourses();
                    break;
                case 3:
                    assignCourseToStudent(scanner, studentManager);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addCourse(Scanner scanner) {
        System.out.print("Enter Course Name: ");
        String course = scanner.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course already exists.");
        } else {
            courses.add(course);
            System.out.println("Course added successfully.");
        }
    }

    private void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses to display.");
        } else {
            System.out.println("Available Courses: " + courses);
        }
    }

    private void assignCourseToStudent(Scanner scanner, StudentManager studentManager) {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        Student student = studentManager.getStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Course Name: ");
        String course = scanner.nextLine();

        if (!courses.contains(course)) {
            System.out.println("Course not found.");
        } else {
            student.addCourse(course);
            System.out.println("Course assigned to student successfully.");
        }
    }
}

// Attendance Tracker
class AttendanceTracker {
    private Map<String, List<String>> attendanceRecords;

    public AttendanceTracker() {
        this.attendanceRecords = new HashMap<>();
    }

    public void recordAttendance(Scanner scanner, StudentManager studentManager) {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        Student student = studentManager.getStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        attendanceRecords.putIfAbsent(studentId, new ArrayList<>());
        attendanceRecords.get(studentId).add(date);
        System.out.println("Attendance recorded for " + student.getName() + " on " + date + ".");
    }
}

// Event Manager
class EventManager {
    private List<Event> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    public void manageEvents(Scanner scanner) {
        while (true) {
            System.out.println("\nEvent Management");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEvent(scanner);
                    break;
                case 2:
                    viewEvents();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addEvent(Scanner scanner) {
        System.out.print("Enter Event Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Event Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter Event Description: ");
        String description = scanner.nextLine();

        events.add(new Event(title, date, description));
        System.out.println("Event added successfully.");
    }

    private void viewEvents() {
        if (events.isEmpty()) {
            System.out.println("No events to display.");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }
}

// Event Class
class Event {
    private String title;
    private String date;
    private String description;

    public Event(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Date: " + date + ", Description: " + description;
    }
}

// Main Class
public class SmartCampusManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();
        AttendanceTracker attendanceTracker = new AttendanceTracker();
        EventManager eventManager = new EventManager();

        while (true) {
            System.out.println("\nWelcome to Smart Campus Management System (SCMS)");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Record Attendance");
            System.out.println("4. Manage Events");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    studentManager.manageStudents(scanner);
                    break;
                case 2:
                    courseManager.manageCourses(scanner, studentManager);
                    break;
                case 3:
                    attendanceTracker.recordAttendance(scanner, studentManager);
                    break;
                case 4:
                    eventManager.manageEvents(scanner);
                    break;
                case 5:
                    System.out.println("Exiting SCMS. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
