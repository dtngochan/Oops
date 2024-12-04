package oops_exercises1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public ReferenceBook() {

    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
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
                System.out.println("Enter tax: ");
                tax = sc.nextDouble();
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
                    System.out.println("Enter new tax: ");
                    tax = sc.nextDouble();
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
                + "\nTax: " + tax);

    }

}
