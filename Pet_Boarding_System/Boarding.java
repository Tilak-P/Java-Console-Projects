package Pet_Boarding_System;

public class Boarding {
    private Pet pet;
    private Room room;
    private int days;
    private double totalAmount;

    public Boarding(Pet pet, Room room, int days) {
        this.pet = pet;
        this.room = room;
        this.days = days;
        this.totalAmount = days * room.getPricePerDay();
    }

    public void display(){
        System.out.println("Pet: " + pet.getName() + " (" + pet.getPtype() + ")");
        System.out.println("Owner: " + pet.getOwner().getName() + " | " + pet.getOwner().getcontact());
        System.out.println("Room " + room.getRoomNumber() + " | Rs." + room.getPricePerDay());
        System.out.println("Days: " + days + " Total: " + totalAmount);
        System.out.println("-----------------------------------");
    }
}
