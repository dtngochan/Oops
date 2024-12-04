package Exercise12;

public class Truck extends Vehicle {

    private double loadCapacity;
    private double distance;

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
        System.out.println("Load capacity: " + loadCapacity
                + "\nDistance: " + distance +
                "\nRental cost: " +calculateRentalCost());
    }

    @Override
    public double calculateRentalCost() {
        return getRentalPricePerDay() + (distance * 5);
    }

}
