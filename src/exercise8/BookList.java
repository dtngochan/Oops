
package exercise8;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    private ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully");
    }
    public boolean deleteBookById(String id){
        for(Book book:books){
            if(book.getId().equals(id)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }
    public boolean updateBookById(String id){
        Scanner scanner = new Scanner(System.in);
        for(Book book:books){
            if(book.getId().equals(id)){
                if (book instanceof TextBook){
                    
                    System.out.println("Enter new title: ");
                    book.setTitle(scanner.nextLine());
                    System.out.println("Enter new base price: ");
                    book.setBasePrice(scanner.nextDouble());
                    sc.nextLine();
                    System.out.println("Enter new subject: ");
                    ((TextBook) book).setSubject(scanner.nextLine());
                                       
                }else if(book instanceof ReferenceBook){
                    System.out.println("Enter new title: ");
                    book.setTitle(scanner.nextLine());
                    System.out.println("Enter new base price: ");
                    book.setBasePrice(scanner.nextDouble());
                    sc.nextLine();
                    System.out.println("Enter new publisher: ");
                    ((ReferenceBook) book).setPublisher(scanner.nextLine());
                }
                return true;
            }
        }
        return false;
    }
    public void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("No books in list");
            
        }else{
            for(Book book:books){
                book.displayDetails();
                System.out.println("---------------");
            }
        }
    }
    public boolean findBookById(String id){
        for(Book book:books){
            if(book.getId().equals(id)){
                book.displayDetails();
                return true;
            }
        }
        return false;
    }
    public Book findMostExpensiveBook(){
        Book expensiveBook = null;
        for(Book book:books){
            if(expensiveBook == null || book.getBasePrice() > expensiveBook.getBasePrice()){
                expensiveBook = book;
            }
        }
        return expensiveBook;
    }
    public Book findSecondExpensiveBook(){
        Book second = null;
        Book most = findMostExpensiveBook();
        for(Book book:books){
            if(second == null ||(second.getBasePrice() < book.getBasePrice() && book.getBasePrice() < most.getBasePrice()) ){
                second = book;
            }
        }
        return second;
    }
    public void countBooks(){
        int countTextBook = 0;
        int countReferenceBook = 0;
        for(Book book:books){
            if(book instanceof TextBook){
                countTextBook++;
            }else if(book instanceof ReferenceBook){
                countReferenceBook++;
            }
        }
        System.out.println("Total number of TextBooks in the book list: " +countTextBook);
        System.out.println("Total number of ReferenceBooks in the book list: " +countReferenceBook);
    }
}
