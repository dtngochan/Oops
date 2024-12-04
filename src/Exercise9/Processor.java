package Exercise9;

import java.util.Scanner;
import javax.sound.midi.MetaMessage;

public class Processor {

    public static void main(String[] args) {
        RoomList roomList = new RoomList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===MENU===");
            System.out.println("1. Add a new meeting rom");
            System.out.println("2. Add a new bedroom");
            System.out.println("3. Update room by id");
            System.out.println("4. Delete room by id");
            System.out.println("5. Find room by id");
            System.out.println("6. Display all rooms");
            System.out.println("7. Find the most expensive room");
            System.out.println("8. Count the total of meeting room and bedrooms separately inthe roomlist");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    MeetingRoom meetingRoom = new MeetingRoom();
                    while (true) {
                        try {
                            System.out.println("Enter room id: ");
                            meetingRoom.setId(sc.nextLine());
                            System.out.println("Enter room name: ");
                            meetingRoom.setName(sc.nextLine());
                            System.out.println("Enter base cost: ");
                            meetingRoom.setBaseCost(sc.nextDouble());
                            System.out.println("Enter capacity: ");
                            meetingRoom.setCapacity(sc.nextInt());
                            roomList.addRoom(meetingRoom);
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. Try again.");
                            sc.nextLine();
                        }
                    }
                    break;
                case 2:
                    BedRoom bedRoom = new BedRoom();
                    while (true) {
                        try {
                            System.out.println("Enter room id: ");
                            bedRoom.setId(sc.nextLine());

                            System.out.println("Enter room name: ");
                            bedRoom.setName(sc.nextLine());

                            System.out.println("Enter base cost: ");
                            bedRoom.setBaseCost(sc.nextDouble());

                            System.out.println("Enter numberOfBeds: ");
                            bedRoom.setNumberOfBeds(sc.nextInt());
                            roomList.addRoom(bedRoom);
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. Try again.");
                            sc.nextLine();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter id to update: ");
                    String idToUpdate = sc.nextLine();
                    if (roomList.updateRoomById(idToUpdate)) {
                        System.out.println("Room updated successfully");
                    } else {
                        System.out.println("Not found room with id " + idToUpdate);
                    }
                    break;
                case 4:
                    System.out.println("Enter id to delete: ");
                    String idToDelete = sc.nextLine();
                    if (roomList.deleteRoomById(idToDelete)) {
                        System.out.println("Room removed successfully");
                    } else {
                        System.out.println("Not found room with id " + idToDelete);
                    }
                    break;
                case 5:
                    System.out.println("Enter id to find: ");
                    String idToFind = sc.nextLine();

                    if (roomList.findRomById(idToFind) != null) {

                    } else {
                        System.out.println("Not found room with id " + idToFind);
                    }
                    break;
                case 6:
                    roomList.displayAllRooms();
                    break;
                case 7:
                    Room mostExpensiveRoom = roomList.findMostExpensiveRoom();
                    if (mostExpensiveRoom != null) {
                        System.out.println("The most expensive room is: ");
                        mostExpensiveRoom.displayDetails();
                    } else {
                        System.out.println("No the most expensive room in list");
                    }
                    break;
                case 8:
                    roomList.countRooms();
                    break;
                case 0:
                    System.out.println("Exiting program.......");
                    break;
                default:
                    System.out.println("Invalid your choice. Try agian");
                    break;

            }

        } while (choice != 0);
    }

}
