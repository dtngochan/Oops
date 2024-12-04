
package Exercise9;

public class MeetingRoom extends Room{
    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }
    

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    

    @Override
    public double calculateCosts() {
        if(capacity > 50){
            return getBaseCost() * 1.2;
        }else{
            return getBaseCost();
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " +getId() +
                "\nName: " +getName() +
                "\nBase Cost: " +calculateCosts() +
                "\nCapacity: " +capacity);
    }
    
    
}
