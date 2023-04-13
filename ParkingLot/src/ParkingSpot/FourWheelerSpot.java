package ParkingSpot;

import Vehicle.Vehicle;

public class FourWheelerSpot extends ParkingSpot {
    private int price = 20;

    FourWheelerSpot(int price, Vehicle vehicle) {
        super(price, vehicle);
    }

    public int getPrice() {
        return this.price;
    }
}
