package Pet_Boarding_System;

public class Room {
    private int roomNumber;
    private double pricePerDay;

    public Room(int roomNumber, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.pricePerDay = pricePerDay;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }
}
