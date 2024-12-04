package exercise8;

import java.util.Scanner;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    Scanner sc = new Scanner(System.in);

    public void addBook() {

        while (true) {
            try {
                System.out.println("Enter id: ");
                String id = sc.nextLine();
                setId(id);

                System.out.println("Enter title book: ");
                String title = sc.nextLine();
                setTitle(title);

                System.out.println("Enter base price: ");
                double price = sc.nextDouble();
                setBasePrice(price);

                sc.nextLine();
                System.out.println("Enter publisher: ");
                publisher = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid. Try again.");
                sc.nextLine();
            }
        }
    }

    public void updateBook() {
        
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 0.8;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId()
                + "\nTitle: " + getTitle()
                + "\nBase price: " + calculatePrice()
                + "\nPublisher: " + publisher);
    }

}
