package exercise10;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class RoomList {
    
    private ArrayList<Room> rooms = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public void addRoom(int x) {
        if (x == 1) {
            MeetingRoom meetingRoom = new MeetingRoom();
            meetingRoom.addRoom();
            rooms.add(meetingRoom);
            System.out.println("Meeting room added successfully");
        } else if (x == 2) {
            BedRoom bedRoom = new BedRoom();
            bedRoom.addRoom();
            rooms.add(bedRoom);
            System.out.println("Bedroom added successfully");
        }
    }
    
    public void updateRoomByID() {
        System.out.println("Enter id to update: ");
        String idToUpdate = sc.nextLine();
        boolean found = false;
        for (Room room : rooms) {
            if (room.getId().equals(idToUpdate)) {
                found = true;
                if (room instanceof MeetingRoom) {
                    while (true) {
                        try {
                            
                            System.out.println("Enter room name: ");
                            room.setName(sc.nextLine());
                            
                            System.out.println("Enter base cost: ");
                            room.setBaseCost(sc.nextDouble());
                            
                            sc.nextLine();
                            System.out.println("Enter checkin date: ");
                            room.setCheckinDate(sdf.parse(sc.nextLine()));
                            
                            System.out.println("Enter checkout date: ");
                            room.setCheckoutDate(sdf.parse(sc.nextLine()));
                            
                            System.out.println("Enter capacity: ");
                            ((MeetingRoom) room).setCapacity(sc.nextInt());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. Try again.");
                            sc.nextLine();
                        }
                    }
                } else if (room instanceof BedRoom) {
                    while (true) {
                        try {

                            System.out.println("Enter room name: ");
                            room.setName(sc.nextLine());
                            
                            System.out.println("Enter base cost: ");
                            room.setBaseCost(sc.nextDouble());
                            
                            sc.nextLine();
                            System.out.println("Enter checkin date: ");
                            room.setCheckinDate(sdf.parse(sc.nextLine()));
                            
                            System.out.println("Enter checkout date: ");
                            room.setCheckoutDate(sdf.parse(sc.nextLine()));
                            
                            System.out.println("Enter number of beds: ");
                            ((BedRoom) room).setNumberOfBeds(sc.nextInt());
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid. Try again.");
                            sc.nextLine();
                        }
                    }
                }
                System.out.println("Room updated successfully");
            }
        }
        if(!found){
            System.out.println("Not found room with id " +idToUpdate);
        }
    }
    public void deleteRoomById(){
        System.out.println("Enter id to delete: ");
        String idToDelete = sc.nextLine();
        boolean found = false;
        for(Room room:rooms){
            if(room.getId().equals(idToDelete)){
                found = true;
                rooms.remove(room);
                System.out.println("Room removed successfully");
            }
        }
        if(!found){
            System.out.println("Not found room with id " +idToDelete);
        }
    }
    public Room findRoomById(){
        System.out.println("Enter id to found: ");
        String idToFind = sc.nextLine();
        for(Room room:rooms){
            if(room.getId().equals(idToFind)){
                System.out.println("Room found: ");
                room.displayDetails();
                return room;
            }
        }
        System.out.println("Not found room with id " +idToFind);
        return null;
    }
    public void displayAllRooms(){
        if(rooms.isEmpty()){
            System.out.println("No rooms in list");
        }else{
            for(Room room:rooms){
                room.displayDetails();
                System.out.println("-------------------");
            }
        }
    }
    public Room findMostExpensiveRoom(){
        Room mostExpensiveRoom = null;
        for(Room room:rooms){
            if(mostExpensiveRoom == null || room.getBaseCost() > mostExpensiveRoom.getBaseCost()){
                mostExpensiveRoom = room;
            }
        }
        return mostExpensiveRoom;
    }
    public void countRooms(){
        int countMeetingRooms = 0;
        int countBedRooms = 0;
        for(Room room:rooms){
            if(room instanceof MeetingRoom){
                countMeetingRooms++;
            }else if (room instanceof BedRoom){
                countBedRooms++;
            }
        }
        System.out.println("Number of meeting rooms: " +countMeetingRooms);
        System.out.println("Number of bedrooms: " +countBedRooms);
    }
}
