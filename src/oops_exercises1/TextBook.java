package oops_exercises1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    private String status;

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public TextBook() {

    }

    public String setStatus() {
        return status;
    }

    public void getStatus(String status) {
        this.status = status;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void addBook() {
        while (true) {
            try {
                sc.nextLine();
                System.out.println("Enter Id book: ");
                String bookId = sc.nextLine();
                setBookId(bookId);
                System.out.println("Enter publisher: ");
                String publisher = sc.nextLine();
                setPublisher(publisher);
                System.out.println("Enter entry date(dd/MM/yyyy): ");
                String entryDate = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                setEntryDate(sdf.parse(entryDate));
                System.out.println("Enter unit price: ");
                double unitPrice = sc.nextDouble();
                setUnitPrice(unitPrice);
                System.out.println("Enter quantity: ");
                double quantity = sc.nextDouble();
                setQuantity(quantity);
                sc.nextLine();
                System.out.println("Enter status: ");
                status = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid format. Try again.");
            }
        }

    }

    @Override
    public void updateBook(String id) {
        if (super.getBookId().equals(id)) {
            while (true) {
                try {
                    sc.nextLine();
                    System.out.println("Enter new publisher: ");
                    String publisher = sc.nextLine();
                    setPublisher(publisher);

                    System.out.println("Enter new entry date(dd/MM/yyyy): ");
                    String entryDate = sc.nextLine();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    setEntryDate(sdf.parse(entryDate));
                    System.out.println("Enter new unit price: ");
                    double unitPrice = sc.nextDouble();
                    setUnitPrice(unitPrice);
                    System.out.println("Enter new quantity: ");
                    double quantity = sc.nextDouble();
                    setQuantity(quantity);
                    sc.nextLine();
                    System.out.println("Enter new status: ");
                    status = sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid format. Try again.");
                }
            }

        }
    }

    @Override
    public void displayBook() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Book ID: " + getBookId()
                + "\nPublisher: " + getPublisher()
                + "\nEntry date: " + sdf.format(getEntryDate())
                + "\nUnit price: " + getUnitPrice()
                + "\nQuantity: " + getQuantity()
                + "\nStatus: " + status);
    }

}
