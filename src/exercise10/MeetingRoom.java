
package exercise10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MeetingRoom extends Room{
    private int capacity;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    

    @Override
    public double calculateCost() {
        long days = dayStays();
        if(getBaseCost() > 50){
            return getBaseCost() *days * 1.2;
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
                
                System.out.println("Enter capacity: ");
                setCapacity(sc.nextInt());
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
                "\nCapacity: " +capacity);
    }
    
}
