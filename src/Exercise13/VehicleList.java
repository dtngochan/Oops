package Exercise13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class VehicleList {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully");
    }

    public boolean updateVehicleById() {
        System.out.println("Enter id to update: ");
        String idToUpdate = sc.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(idToUpdate)) {
                if (vehicle instanceof Car) {
                    while (true) {
                        try {
                            System.out.println("Enter new brand: ");
                            vehicle.setBrand(sc.nextLine());

                            System.out.println("Enter new model: ");
                            vehicle.setModel(sc.nextLine());
                            
                            System.out.println("Enter new retal days: ");
                            vehicle.setRentalDays(sc.nextInt());

                            System.out.println("Enter new rentel price per day: ");
                            vehicle.setRentalPricePerDay(sc.nextDouble());

                            System.out.println("Enter new number of seats: ");
                            ((Car) vehicle).setNumberOfSeats(sc.nextInt());

                            sc.nextLine();
                            System.out.println("Enter new fuel type: ");
                            ((Car) vehicle).setFuelType(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. Try agian");
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

                            System.out.println("Enter new rentel price per day: ");
                            vehicle.setRentalPricePerDay(sc.nextDouble());

                            System.out.println("Enter new load capacity: ");
                            ((Truck) vehicle).setLoadCapacity(sc.nextDouble());

                            System.out.println("Enter new dinstance: ");
                            ((Truck) vehicle).setDistance(sc.nextDouble());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. Try agian");
                            sc.nextLine();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean deleteVehicleById() {
        System.out.println("Enter id to delete: ");
        String idToDelete = sc.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(idToDelete)) {
                vehicles.remove(vehicle);
                return true;
            }
        }
        return false;
    }

    public Vehicle findVehicleById(String idToFind) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(idToFind)) {
                System.out.println("Vehicle with id " + idToFind);
                vehicle.displayDetails();
                return vehicle;
            }
        }
        return null;
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in list");
        } else {
            for (Vehicle vehicle : vehicles) {
                vehicle.displayDetails();
                System.out.println("--------------------");
            }
        }
    }

    public ArrayList<Car> findCarsBySeats(int seats) {
        
        ArrayList<Car> cars = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                if (car.getNumberOfSeats() == seats) {
                    cars.add(car);
                }
            }
        }
        return cars;
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
