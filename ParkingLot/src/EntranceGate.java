import Enums.VehicleType;

import java.util.HashMap;

public class EntranceGate {
    HashMap<String, Integer> parkingSpace = new HashMap<>();

    EntranceGate(int twoWheeler, int fourWheeler) {
        parkingSpace.put(String.valueOf(VehicleType.TwoWheeler), twoWheeler);
        parkingSpace.put(String.valueOf(VehicleType.FourWheeler), fourWheeler);
    }

//    public Ticket generateTicket() {}

//    public ParkingSpot findParkingSpace(VehicleType vehicleType) {}

//    public void updateParkingSpace() {}
}
