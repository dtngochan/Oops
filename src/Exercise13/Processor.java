package Exercise13;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        VehicleList vehicleList = new VehicleList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("====MENU====");
            {
                System.out.println("1. Add a new car");
                System.out.println("2. Add a new truck");
                System.out.println("3. Update vehicle by id");
                System.out.println("4. Delete vehicle by id");
                System.out.println("5. Find vehicle by id");
                System.out.println("6. Display all vehicles");
                System.out.println("7. Find cars by number of seats");
                System.out.println("8. Find the truck with the longest distance");
                System.out.println("9. Find electric cars");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        Car car = new Car();
                        car.addVehicle();
                        vehicleList.addVehicle(car);
                        break;
                    case 2:
                        Truck truck = new Truck();
                        truck.addVehicle();
                        vehicleList.addVehicle(truck);
                        break;
                    case 3:
                        if (vehicleList.updateVehicleById()) {
                            System.out.println("Vehicle updated successfully");
                        } else {
                            System.out.println("Not found vehicle.");
                        }
                        break;
                    case 4:
                        if (vehicleList.deleteVehicleById()) {
                            System.out.println("Vehicle deleted successfully");
                        } else {
                            System.out.println("Not found vehicle");
                        }
                        break;
                    case 5:
                        System.out.println("Enter id to find: ");
                        String idToFind = sc.nextLine();
                        if (vehicleList.findVehicleById(idToFind) != null) {

                        } else {
                            System.out.println("Not found vehicle");
                        }
                        break;
                    case 6:
                        vehicleList.displayAllVehicles();
                        break;
                    case 7:                        
                        System.out.println("Enter seats to find: ");
                        int seats = sc.nextInt();
                        ArrayList<Car> carList = vehicleList.findCarsBySeats(seats);
                        if (carList.isEmpty()) {
                            System.out.println("No cars with " +seats +" seats");
                        }else{
                            System.out.println("List car with " +seats +" seats");
                            for(Car carr:carList){
                                carr.displayDetails();
                                System.out.println("-----------------------");
                            }
                        }
                        break;
                    case 8:
                        Truck longestDistance = vehicleList.findTruckWithLongestDistance();
                        if(longestDistance != null){
                            System.out.println("Truck with the longest distance: ");
                            longestDistance.displayDetails();
                        }else{
                            System.out.println("Not truck with the loongest distance");
                        }
                        break;
                    case 9:
                        ArrayList<Car> findElectricCars = vehicleList.findElectricCars();
                        if(findElectricCars.isEmpty()){
                            System.out.println("Not electric cars");
                        }else{
                            System.out.println("Electric cars: ");
                            for(Car electricCar:findElectricCars){
                                electricCar.displayDetails();
                                System.out.println("-------------------------");
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Exiting program.............");
                        break;
                    default:
                        System.out.println("Invalid your choice. Try again.");
                        break;                                                                 
                }
            }
        }while(choice != 0);
    }

}
