
package oops_exercises2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ReferenceBook extends Book{
    private double tax;
    public ReferenceBook(){
        
    }
    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax){
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }
    public double getTax(){
        return tax;
    }
    public void setTax(double tax){
        this.tax= tax;
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void addBook() {
        while (true) {
            try {
                sc.nextLine();
                System.out.println("Enter book id: ");
                String bookId = sc.nextLine();
                setBookId(bookId);
                System.out.println("Enter publisher: ");
                String publisher = sc.nextLine();
                setPublisher(publisher);
                System.out.println("Enter entry date: ");
                String entryDate = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                setEntryDate(sdf.parse(entryDate));
                System.out.println("Enter unit price: ");
                double unitPrice = sc.nextDouble();
                setUnitPrice(unitPrice);
                System.out.println("Enter quantity: ");
                double quantity = sc.nextLong();
                setQuantity(quantity);
                System.out.println("Enter tax: ");
                tax = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid format. Try again");
                sc.nextLine();
            }
        }
    }

    @Override
    public void updateBook(String id) {
        while (true) {
            try {
                sc.nextLine();
                System.out.println("Enter new publisher: ");
                String publisher = sc.nextLine();
                setPublisher(publisher);
                System.out.println("Enter new entry date: ");
                String entryDate = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                setEntryDate(sdf.parse(entryDate));
                System.out.println("Enter new unit price: ");
                double unitPrice = sc.nextDouble();
                setUnitPrice(unitPrice);
                System.out.println("Enter new quantity: ");
                double quantity = sc.nextLong();
                setQuantity(quantity);
                System.out.println("Enter new tax: ");
                tax = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid format. Try again");
                sc.nextLine();
            }
        }
    }
    

    @Override
    public void displayBook() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Book Id: " + getBookId()
                + "\nPublisher: " + getPublisher()
                + "\nEntry date: " + sdf.format(getEntryDate())
                + "\nUnit price: " + getUnitPrice()
                + "\nQuantity: " + getQuantity()
                + "\nTax: " + tax);
    }
    public double calculateDiscount(){
        double discount = getQuantity() * getUnitPrice() * 0.05;
        return discount;
    }
    @Override
    public double calculateTotal() {
        double total = getQuantity() * getUnitPrice() + tax;
        double discount = calculateDiscount();
        double referenceBookTotal = total - discount;
        return referenceBookTotal;
    }
    
    
}
