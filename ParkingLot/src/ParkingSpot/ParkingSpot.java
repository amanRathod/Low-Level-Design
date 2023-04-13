package ParkingSpot;

import Vehicle.Vehicle;

import java.util.UUID;

public class ParkingSpot {
    private UUID id;
    private boolean isEmpty = true;
    private int price;
    Vehicle vehicle;

    ParkingSpot(int price, Vehicle vehicle) {
        this.id = UUID.randomUUID();
        this.price = price;
        this.vehicle = vehicle;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getParkingSpotIsEmpty() {
        return this.isEmpty;
    }

    public void setParkingSpotIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public void parkVehicle(Vehicle v) {
        this.vehicle = v;
        isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        isEmpty = true;
    }
}




