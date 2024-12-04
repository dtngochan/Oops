package Exercise9;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomList {

    private ArrayList<Room> rooms = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room added successfully");
    }

    public boolean updateRoomById(String id) {
        for (Room room : rooms) {
            if (room.getId().equals(id)) {
                if (room instanceof MeetingRoom) {
                    while (true) {
                        try {
                            System.out.println("Enter new name: ");
                            room.setName(sc.nextLine());
                            System.out.println("Enter new base cost: ");
                            room.setBaseCost(sc.nextDouble());
                            System.out.println("Enter new capacity: ");
                            ((MeetingRoom) room).setCapacity(sc.nextInt());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. Try again");
                            sc.nextLine();
                        }
                    }

                } else if (room instanceof BedRoom) {
                    while (true) {
                        try {
                            System.out.println("Enter new name: ");
                            room.setName(sc.nextLine());
                            System.out.println("Enter new base cost: ");
                            room.setBaseCost(sc.nextDouble());
                            System.out.println("Enter new number of beds: ");
                            ((BedRoom) room).setNumberOfBeds(sc.nextInt());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. Try again");
                            sc.nextLine();
                        }
                    }

                }
                return true;
            }
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        for (Room room : rooms) {
            if (room.getId().equals(id)) {
                rooms.remove(room);
                
            }
            return true;
        }
        return false;
    }

    public Room findRomById(String id) {
        for (Room room : rooms) {
            if (room.getId().equals(id)) {
                System.out.println("Room found: ");
                room.displayDetails();
                return room;
            }
            
        }
        return null;
    }

    public void displayAllRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms in list");
        } else {
            for (Room room : rooms) {
                room.displayDetails();
                System.out.println("-------------------");
            }
        }
    }

    public Room findMostExpensiveRoom() {
        Room mostExpensiveRoom = null;
        for (Room room : rooms) {
            if (mostExpensiveRoom == null || room.getBaseCost() > mostExpensiveRoom.getBaseCost()) {
                mostExpensiveRoom = room;
            }
        }
        return mostExpensiveRoom;
    }

    public void countRooms() {
        int countMeetingRooms = 0;
        int countBedRooms = 0;
        for (Room room : rooms) {
            if (room instanceof MeetingRoom) {
                countMeetingRooms++;
            } else if (room instanceof BedRoom) {
                countBedRooms++;
            }
        }
        System.out.println("Number of meeting rooms: " + countMeetingRooms);
        System.out.println("Number of bed rooms: " + countBedRooms);
    }
}
