package ParkingSpotManager;

import ParkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager {
    List<ParkingSpot> list = new ArrayList<>();

    TwoWheelerManager(List<ParkingSpot> list) {
        super(list);
    }
}
