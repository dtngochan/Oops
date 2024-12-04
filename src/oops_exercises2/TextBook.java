package oops_exercises2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    private String status;

    public TextBook() {

    }

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
    public void getStatus(String status){
        this.status = status;
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
                sc.nextLine();
                System.out.println("Enter status: ");
                status = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid format. Try again");
                sc.nextLine();
            }
        }
    }

    @Override
    public void updateBook(String id) {
        if (this.getBookId().equals(id)) {
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
                    sc.nextLine();
                    System.out.println("Enter new status: ");
                    status = sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid format. Try again");
                }
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
                + "\nStatus: " + status);
    }
    public double calculateDiscount(){
        double discount = 0;
        if("new".equals(status)){
            discount = getQuantity() * getUnitPrice() * 0.1;
        }else if("old".equals(status)){
            discount = getQuantity() * getUnitPrice() * 0.5;
        }else{
            System.out.println("Invalid status. No discount applied.");
        }
        return discount;
    }
    @Override
    public double calculateTotal() {
        double total = getQuantity() * getUnitPrice();
        double discount = calculateDiscount();
        double textBookTotal = total - discount;
        return textBookTotal;
    }

}
