
package exercise8;

import java.util.Scanner;

public class TextBook extends Book{
    private String subject;

    public TextBook() {
    }

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    Scanner sc = new Scanner(System.in);
   
    @Override
    public double calculatePrice() {
        return getBasePrice() * 0.9;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " +getId() +
                "\nTitle: " +getTitle() +
                "\nBase price: " +calculatePrice() +
                "\nSubject: " +subject);
    }
    
}
