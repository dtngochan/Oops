package Exercise13;

import java.util.Scanner;

public class Truck extends Vehicle {

    private double loadCapacity;
    private double distance;
    Scanner sc = new Scanner(System.in);

    public Truck() {
    }

    public Truck(double loadCapacity, double distance, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
        this.distance = distance;
    }

    
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void displayDetails() {
       super.displayDetails();
        System.out.println("Load capacity: " +loadCapacity +
                "\nDistance: " +distance);
    }

    @Override
    public double calculateRentalCost() {
        return getRentalPricePerDay() + (distance * 5);
    }

    @Override
    public void addVehicle() {
        while (true) {
            try {
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

                System.out.println("Enter load capacity: ");
                setLoadCapacity(sc.nextDouble());

                System.out.println("Enter distance: ");
                setDistance(sc.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("Inavlid. Try again.");
                sc.nextLine();
            }
        }
    }

}
