package Exercise12;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleList {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully");
    }

    public boolean updateVehicleById(String id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                if (vehicle instanceof Car) {
                    while (true) {
                        try {
                            System.out.println("Enter new brand: ");
                            vehicle.setBrand(sc.nextLine());

                            System.out.println("Enter new model: ");
                            vehicle.setModel(sc.nextLine());

                            System.out.println("Enter new retal days: ");
                            vehicle.setRentalDays(sc.nextInt());

                            System.out.println("Enter new rental price per day: ");
                            vehicle.setRentalPricePerDay(sc.nextDouble());

                            System.out.println("Enter new number of seats: ");
                            ((Car) vehicle).setNumberOfSeats(sc.nextInt());

                            sc.nextLine();
                            System.out.println("Enter new fuel type(electric, petrol, diesel): ");
                            ((Car) vehicle).setFuelType(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Inavlid. Try again");
                            sc.nextLine();
                        }
                    }
                } else if (vehicle instanceof Truck) {
                    while (true) {
                        try {
                            System.out.println("Enter new brand: ");
                            vehicle.setBrand(sc.nextLine());

                            System.out.println("Enter new model: ");
                            vehicle.setModel(sc.nextLine());

                            System.out.println("Enter new retal days: ");
                            vehicle.setRentalDays(sc.nextInt());

                            System.out.println("Enter new rental price per day: ");
                            vehicle.setRentalPricePerDay(sc.nextDouble());

                            System.out.println("Enter new number of load capacity: ");
                            ((Truck) vehicle).setLoadCapacity(sc.nextDouble());

                            System.out.println("Enter new distance: ");
                            ((Truck) vehicle).setDistance(sc.nextDouble());
                            break;
                        } catch (Exception e) {
                            System.out.println("Inavlid. Try again");
                            sc.nextLine();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean deleteVehicleById(String id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                vehicles.remove(vehicle);
                return true;
            }
        }
        return false;
    }

    public void findVehicleById(String id) {
        boolean found = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                System.out.println("Vehicle found: ");
                vehicle.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found vehicle with id " + id);
        }
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in list");
        } else {
            for (Vehicle vehicle : vehicles) {
                vehicle.displayDetails();
                System.out.println("------------------");
            }
        }
    }
    public ArrayList<Car> findTop3CarsBySeats(){
        ArrayList<Car> top3Cars = new ArrayList<>();
        Car top1 = null;
        Car top2 = null;
        Car top3 = null;
        for(Vehicle vehicle:vehicles){
            if(vehicle instanceof Car){
                Car car = (Car) vehicle;
                if(top 1 == null || car.getNumberOfSeats() > top1.getNumberOfSeats()){
                    top1 = car;
            }
            }
        }
    }

    public Truck findTruckWithLongestDistance() {
        Truck longest = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                if (longest == null || truck.getDistance() > longest.getDistance()) {
                    longest = truck;
                }
            }
        }
        return longest;
    }
    
    public ArrayList<Car> findElectricCars() {
        ArrayList<Car> cars = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                if (car.getFuelType().equalsIgnoreCase("electric")) {
                    cars.add(car);
                }
            }
        }
        return cars;
    }
}
