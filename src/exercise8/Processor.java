package exercise8;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("====MENU====");
            System.out.println("1. Add new text book");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count the total number of TextBooks and ReferenceBooks separately in the book list");
            System.out.println("0. Exit");
            System.out.println("9. FInd second");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    TextBook textBook = new TextBook();
                    while (true) {
                        try {
                            sc.nextLine();
                            System.out.println("Enter id: ");
                            textBook.setId(sc.nextLine());

                            System.out.println("Enter title book: ");
                            textBook.setTitle(sc.nextLine());

                            System.out.println("Enter base price: ");
                            textBook.setBasePrice(sc.nextDouble());

                            sc.nextLine();
                            System.out.println("Enetr subject: ");
                            textBook.setSubject(sc.nextLine());
                            break;

                        } catch (Exception e) {
                            System.out.println("Invalid. Try again.");
                            sc.nextLine();
                        }
                    }
                    bookList.addBook(textBook);
                    break;
                case 2:
                    ReferenceBook referenceBook = new ReferenceBook();
                    while (true) {
                        try {
                            sc.nextLine();
                            System.out.println("Enter id: ");
                            referenceBook.setId(sc.nextLine());
                            
                            System.out.println("Enter new title: ");
                            referenceBook.setTitle(sc.nextLine());

                            System.out.println("Enter new base price: ");
                            referenceBook.setBasePrice(sc.nextDouble());

                            sc.nextLine();
                            System.out.println("Enter new publisher: ");
                            referenceBook.setPublisher(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. Try again");
                            sc.nextLine();
                        }
                    }
                    bookList.addBook(referenceBook);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter id to update: ");
                    String idToUpdate = sc.nextLine();
                    if (bookList.updateBookById(idToUpdate)) {
                        System.out.println("Book updated successfully");
                    } else {
                        System.out.println("Not book found");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Enter id to delete: ");
                    String idToDelete = sc.nextLine();
                    if (bookList.deleteBookById(idToDelete)) {
                        System.out.println("Book removed");
                    } else {
                        System.out.println("Not book found");
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Enter id to find: ");
                    String idToFind = sc.nextLine();
                    if (bookList.findBookById(idToFind)) {
                        System.out.println("Book found: ");
                        bookList.findBookById(idToFind);

                    } else {
                        System.out.println("Not book found");
                    }
                    break;
                case 6:
                    bookList.displayAllBooks();
                    break;
                case 7:
                    Book expensivePrice = bookList.findMostExpensiveBook();
                    if (expensivePrice != null) {
                        System.out.println("Book is expensive price: ");
                        expensivePrice.displayDetails();
                    } else {
                        System.out.println("Not book found.");
                    }
                    break;
                case 8:
                    bookList.countBooks();
                    break;
                case 9:
                    Book second = bookList.findSecondExpensiveBook();
                    if(second != null){
                        System.out.println("Second: ");
                        second.displayDetails();
                    }else{
                        System.out.println("no");
                    }
                    break;
                case 0:
                    System.out.println("Exiting program.............");
                    break;
                default:
                    System.out.println("Invalide your choice. Try again.");
                    break;
            }
        } while (choice != 0);
    }
}
