
package Exercise9;

public class BedRoom extends Room{
    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    

    @Override
    public double calculateCosts() {
        if(numberOfBeds >= 3){
            return getBaseCost() * 1.1;
        }else{
            return getBaseCost();
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " +getId() +
                "\nName: " +getName() +
                "\nBase cost: " +calculateCosts() +
                "\nNumber of beds: " +numberOfBeds);
    }
    
}
