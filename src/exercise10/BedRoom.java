
package exercise10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BedRoom extends Room{
    private int numberOfBeds;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public BedRoom() {
    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    

    @Override
    public double calculateCost() {
        long days = dayStays();
        if(numberOfBeds >= 3){
            return getBaseCost() * days * 1.1;
        }else{
            return getBaseCost() * days;
        }
    }

    @Override
    public void addRoom() {
         while(true){
            try{
                System.out.println("Enter room id: ");
                setId(sc.nextLine());
                
                System.out.println("Enter room name: ");
                setName(sc.nextLine());
                
                System.out.println("Enter base cost: ");
                setBaseCost(sc.nextDouble());
                
                sc.nextLine();
                System.out.println("Enter checkin date: ");
                setCheckinDate(sdf.parse(sc.nextLine()));
                
                System.out.println("Enter checkout date: ");
                setCheckoutDate(sdf.parse(sc.nextLine()));
                
                System.out.println("Enter number of beds: ");
                setNumberOfBeds(sc.nextInt());
                break;
            }catch(Exception e){
                System.out.println("Invalid. Try again.");
                sc.nextLine();
            }
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " +getId() +
                "\nName: " +getName() +
                "\nBase cost: " +calculateCost() +
                "\nCheckin date: " +sdf.format(getCheckinDate()) +
                "\nCheckout date: " +sdf.format(getCheckoutDate()) +
                "\nNumber of beds: " +numberOfBeds);
    }
    
    
}
