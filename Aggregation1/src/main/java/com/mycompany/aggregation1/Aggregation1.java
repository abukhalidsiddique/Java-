package com.mycompany.aggregation1;
import java.util.*;
 class Book
 {
     String title,author,isbn;
     Book(String title,String author,String isbn)
     {
         this.title=title;
         this.author=author;
         this.isbn=isbn;
     }
     String getTitle()
     {
         return title;
     }
     String getAuthor()
     {
         return author;
     }
     String getIsbn()
     {
         return isbn;
     }
     @Override 
     public String toString()
     {
         return "Title: "+title+"  author: "+author+"  isbn: "+isbn;
     }
     
 }

class Library
{
    ArrayList<Book> books;
    Library()
    {
        this.books=new ArrayList<>();
    }
    void addBook(Book book)
    {
        books.add(book);
        System.out.println(book.getTitle()+" is added");
    }
    void removeBook(String isbn)
    {
        for(Book book:books)
        {
            if(book.getIsbn().equals(isbn))
            {
                books.remove(book);
                System.out.println(book.getTitle()+" is removed");
            }
            else 
                System.out.println("not available");
        }
    }
    
    void display()
    {
        if(books.isEmpty())
        {
            System.out.println("Books isnt available");
             
        }
        else
        {
            System.out.println("Books: ");
            for(Book book:books)
            {
                System.out.println(book);
            }
        }   
    }
    
    
    
}
public class Aggregation1 {

    public static void main(String[] args) 
    {
        Book b1=new Book("aaa","1","111");
        Book b2=new Book("bbb","2","222");
        Book b3=new Book("ccc","3","333");
        Library libraries=new Library();
        libraries.display();
        libraries.addBook(b1);
        libraries.addBook(b2);
        libraries.addBook(b3);
        libraries.display();
        libraries.removeBook("222");
        libraries.display();
        libraries=null;
          
         
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
