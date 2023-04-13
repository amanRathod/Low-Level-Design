package ParkingSpotManager;

import ParkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{
    List<ParkingSpot> list = new ArrayList<>();

    FourWheelerManager(List<ParkingSpot> list) {
        super(list);
    }
}
