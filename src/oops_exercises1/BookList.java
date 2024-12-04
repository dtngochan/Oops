package oops_exercises1;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    private ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addBook() {
        System.out.println("Enter number of books");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter book type(1: Text book, 2: Reference book): ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    TextBook textBook = new TextBook();
                    textBook.addBook();
                    books.add(textBook);
                    break;
                case 2:
                    ReferenceBook referenceBook = new ReferenceBook();
                    referenceBook.addBook();
                    books.add(referenceBook);
                    break;
                default:
                    System.out.println("Your choose invalid. Try again.");
                    break;
            }
        }
    }

    public void updateBook() {
        if (books.isEmpty()) {
            System.out.println("No book in list.");
            return;
        }
        System.out.println("Enter id of book want to update: ");
        String idToUpdate = sc.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.getBookId().equals(idToUpdate)) {
                found = true;
                book.updateBook(idToUpdate);
                System.out.println("Book updated successfully.");
            }
        }
        if (!found) {
            System.out.println("Not found book");
        }
    }

    public void displayAll() {
        if (books.isEmpty()) {
            System.out.println("No book in list");
            return;
        }
        for (Book book : books) {
            book.displayBook();
            System.out.println("----------------");
        }
    }

    public void deleteBookById() {
        if (books.isEmpty()) {
            System.out.println("No book in list");
            return;
        }
        System.out.println("Enter id of book want to delete: ");
        String idToDelete = sc.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.getBookId().equals(idToDelete)) {
                books.remove(book);
                System.out.println("Book deleted");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found book");
        }
    }

    public Book findBookById() {
        if (books.isEmpty()) {
            System.out.println("No book in list");
            return null;
        }
        System.out.println("Enter id of book want to find: ");
        String idToFind = sc.nextLine();
        for (Book book : books) {
            if (book.getBookId().equals(idToFind)) {
                System.out.println("Book found: ");
                book.displayBook();
                return book;
            }
        }
        System.out.println("Not found book");
        return null;
    }
}
