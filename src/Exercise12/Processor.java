package Exercise12;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        VehicleList vehicleList = new VehicleList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("====MENU====");
            System.out.println("1. Add a new car");
            System.out.println("2. Add a new truck");
            System.out.println("3. Update vehicle by id");
            System.out.println("4. Delete vehicle by id");
            System.out.println("5. Find vehicle by id");
            System.out.println("6. Display all vehicles");
            System.out.println("7. Find the top 3 with highest number of seats");
            System.out.println("8. Find the truck with the longest distance");
            System.out.println("9. Find electric cars");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    Car car = new Car();
                    while (true) {
                        try {
                            System.out.println("Enter id: ");
                            car.setId(sc.nextLine());

                            System.out.println("Enter brand: ");
                            car.setBrand(sc.nextLine());

                            System.out.println("Enter model: ");
                            car.setModel(sc.nextLine());

                            System.out.println("Enter rental days: ");
                            car.setRentalDays(sc.nextInt());

                            System.out.println("Enter rental price per day: ");
                            car.setRentalPricePerDay(sc.nextDouble());

                            System.out.println("Enter number of seats: ");
                            car.setNumberOfSeats(sc.nextInt());

                            sc.nextLine();
                            System.out.println("Enter fuel tyoe(electric, petrol, diesel): ");
                            car.setFuelType(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. try again");
                            sc.nextLine();
                        }
                    }
                    vehicleList.addVehicle(car);
                    break;
                case 2:
                    Truck truck = new Truck();
                    while (true) {
                        try {
                            System.out.println("Enter id: ");
                            truck.setId(sc.nextLine());

                            System.out.println("Enter brand: ");
                            truck.setBrand(sc.nextLine());

                            System.out.println("Enter model: ");
                            truck.setModel(sc.nextLine());

                            System.out.println("Enter rental days: ");
                            truck.setRentalDays(sc.nextInt());

                            System.out.println("Enter rental price per day: ");
                            truck.setRentalPricePerDay(sc.nextDouble());

                            System.out.println("Enter load capacity: ");
                            truck.setLoadCapacity(sc.nextDouble());

                            System.out.println("Enter distance: ");
                            truck.setDistance(sc.nextDouble());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. try again");
                            sc.nextLine();
                        }
                    }
                    vehicleList.addVehicle(truck);
                    break;
                case 3:
                    System.out.println("Enter id to update: ");
                    String idToUpdate = sc.nextLine();
                    if(vehicleList.updateVehicleById(idToUpdate)){
                        System.out.println("Updated successfully");
                    }else{
                        System.out.println("Not found vehicle with id " +idToUpdate);
                    }
                    break;
                case 4:
                    System.out.println("Enter id to delete: ");
                    String idToDelete = sc.nextLine();
                    if(vehicleList.deleteVehicleById(idToDelete)){
                        System.out.println("Removed successfully");
                    }else{
                        System.out.println("Not found vehicle with id " +idToDelete);
                    }break;
                case 5:
                    System.out.println("Enter id to find: ");
                    String idToFind = sc.nextLine();
                    vehicleList.findVehicleById(idToFind);
                    break;
                case 6:
                    vehicleList.displayAllVehicles();
                    break;
                case 7:
                    ArrayList<Car> top3Cars =vehicleList.findTop3CarsBySeats();
                    if(top3Cars.isEmpty()){
                        System.out.println("No cars available");
                    }else{
                        System.out.println("Top 3 cars with highest number of seats: ");
                        for(Car carr:top3Cars){
                            carr.displayDetails();
                            System.out.println("------------------------");
                        }
                    }
                    break;
                case 8:
                    Truck longest = vehicleList.findTruckWithLongestDistance();
                    if(longest != null){
                        System.out.println("Truck with the longest distance: ");
                        longest.displayDetails();
                        
                    }else{
                        System.out.println("Not truck with the longest distane");
                    }
                    break;
                case 9:
                    ArrayList<Car> carList = vehicleList.findElectricCars();
                    if(carList.isEmpty()){
                        System.out.println("No electric car in list");
                    }else{
                        System.out.println("Electric car: ");
                        for(Car electricCar:carList){
                            electricCar.displayDetails();
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting program..............");
                    break;
                default:
                    System.out.println("Invalid your choice. Try again.");
                    break;
            }
        }while(choice != 0);
    }

}
