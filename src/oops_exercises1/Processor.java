
package oops_exercises1;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args){
        BookList bookList = new BookList();
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("===MENU===");
            System.out.println("1. Add new book");
            System.out.println("2. Update book by id");
            System.out.println("3. Delete book by id");
            System.out.println("4. Find book by id");
            System.out.println("5. Display all books");
            System.out.println("0. Exit");
            System.out.println("Enter your choose: ");
            choose = sc.nextInt();
            switch(choose){
                case 1:
                    bookList.addBook();
                    break;
                case 2:
                    bookList.updateBook();
                    break;
                case 3:
                    bookList.deleteBookById();
                    break;
                case 4:
                    bookList.findBookById();
                    break;
                case 5:
                    bookList.displayAll();
                    break;
                case 0:
                    System.out.println("Exting program.........");
                    break;
                default:
                    System.out.println("Your choose invalid. Try agian");
                    break;
            }
        }while(choose != 0);
    }
}
