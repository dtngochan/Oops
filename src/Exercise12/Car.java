
package Exercise12;

public class Car extends Vehicle{
    private int numberOfSeats;
    private String fuelType;

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
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Number of seats: " +numberOfSeats +
                "\nFuel type: " +fuelType +
                "\nRental cost: " +calculateRentalCost());
    }

    @Override
    public double calculateRentalCost() {
        if(fuelType.equalsIgnoreCase("electric")){
            return getRentalPricePerDay() * getRentalDays() * 0.9;
        }else{
            return getRentalPricePerDay() * getRentalDays();
        }
    }
    
}
