import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

public class Ticket {
    private String entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

//    Ticket(String entryTime, ParkingSpot parkingSpot) {
//        this.entryTime = entryTime;
//        this.parkingSpot = parkingSpot;
//    }

    public String getEntryTime() {
        return this.entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }
}
