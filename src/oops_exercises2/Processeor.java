package oops_exercises2;

import java.util.Scanner;

public class Processeor {

    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("===MENU===");
            System.out.println("1. Add new text book");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Display total amount");
            System.out.println("0. Exit");
            System.out.println("Enter your choose: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Adding a new text book...");
                    bookList.addBook(); // Gọi addBook(), đã hỗ trợ thêm loại sách trong lớp BookList
                    break;
                case 2:
                    System.out.println("Adding a new reference book...");
                    bookList.addBook();
                    break;
                case 3:
                    bookList.updateBook();
                    break;
                case 4:
                    bookList.deleteBookById();
                    break;
                case 5:
                    bookList.findBookById();
                    break;
                case 6:
                    bookList.displayAll();
                    break;
                case 7:
                    double totalAmount = bookList.calculateTotalAmount();
                    System.out.println("Total amount of all books: " + totalAmount);
                    break;
                case 0:
                    System.out.println("Exiting program........");
                    break;
                default:
                    System.out.println("Invalid choose. Try again");
                    break;
            }
        } while (choose != 0);
    }
}
