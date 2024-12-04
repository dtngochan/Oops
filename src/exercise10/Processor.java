
package exercise10;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        RoomList roomList= new RoomList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("====MENU====");
            System.out.println("1. Add a new meeting room");
            System.out.println("2. Add a new bedroom");
            System.out.println("3. Update room by id");
            System.out.println("4. Delete room by id");
            System.out.println("5. Find room by id");
            System.out.println("6. Display all rooms");
            System.out.println("7. Find the most expensive room");
            System.out.println("8. Count the total number of meeting room and bedroom separately in the roomlist");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    roomList.addRoom(1);
                    break;
                case 2:
                    roomList.addRoom(2);
                    break;
                case 3:
                    roomList.updateRoomByID();
                    break;
                case 4:
                    roomList.deleteRoomById();
                    break;
                case 5:
                    roomList.findRoomById();
                    break;
                case 6:
                    roomList.displayAllRooms();
                    break;
                case 7:
                    Room mostExpensiveRoom = roomList.findMostExpensiveRoom();
                    if(mostExpensiveRoom != null){
                        System.out.println("The most expensive room is: ");
                        mostExpensiveRoom.displayDetails();
                    }else{
                        System.out.println("Not found the most expensive room");
                    }
                    break;
                case 8:
                    roomList.countRooms();
                    break;
                case 0:
                    System.out.println("Exiting programm.............");
                    break;
                default:
                    System.out.println("Invalid your choice. Try again.");
                    break;
            }
        }while(choice != 0);
    }
}
