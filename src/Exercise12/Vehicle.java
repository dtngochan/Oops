
package Exercise12;

public abstract class Vehicle implements IVehicle{
    private String id;
    private String brand;
    private String model;
    private int rentalDays;
    private double rentalPricePerDay;

    public Vehicle() {
    }

    public Vehicle(String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentalDays = rentalDays;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }
    @Override
    public void displayDetails(){
        System.out.println("ID: " +id +
                "\nBrand: " +brand +
                "\nModel: " +model +
                "\nRental days: " +rentalDays +
                "\nRentel price per day: " +rentalPricePerDay);
    }
    public abstract double calculateRentalCost();
    
}
