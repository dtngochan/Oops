
package Exercise13;

import java.util.Scanner;

public class Car extends Vehicle{
    private int numberOfSeats;
    private String fuelType;
    Scanner sc = new Scanner(System.in);

    public Car() {
    }

    public Car(int numberOfSeats, String fuelType, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of seats: " +numberOfSeats +
                "\nFuel type: " +fuelType);
    }

    @Override
    public void addVehicle() {
        while(true){
            try{
                System.out.println("Enter id: ");
                setId(sc.nextLine());
                
                System.out.println("Enter brand: ");
                setBrand(sc.nextLine());
                
                System.out.println("Enter model: ");
                setModel(sc.nextLine());
                
                System.out.println("Enter retal days: ");
                setRentalDays(sc.nextInt());
                
                System.out.println("Enter rentel price per day: ");
                setRentalPricePerDay(sc.nextDouble());
                
                System.out.println("Enter number of seats: ");
                setNumberOfSeats(sc.nextInt());
                
                sc.nextLine();
                System.out.println("Enter fuel type(petrol, diesel, electric): ");
                setFuelType(sc.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Inavlid. Try again.");
                sc.nextLine();
            }
        }
    }

    @Override
    public double calculateRentalCost() {
        if(fuelType.equalsIgnoreCase("electric")){
            return getRentalPricePerDay() * getRentalDays() * 0.9;
        }else{
            return getRentalPricePerDay()* getRentalDays();
        }
    }
    
}
