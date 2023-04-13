package ParkingSpot;

import Vehicle.Vehicle;

public class TwoWheelerSpot extends ParkingSpot {
    private int price = 10;

    TwoWheelerSpot(int price, Vehicle vehicle) {
        super(price, vehicle);
    }

    public int getPrice() {
        return this.price;
    }
}
