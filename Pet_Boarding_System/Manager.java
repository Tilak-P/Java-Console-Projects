package Pet_Boarding_System;

public class Manager extends User {
    public Manager(String name){
        super(name);
    }

    @Override
    public void showMenu(){
        System.out.println("Welcome " + name + " - Pet Boarding System");
        System.out.println("1. Register Pet Owner");
        System.out.println("2. Add Pet");
        System.out.println("3. Book Boarding Room");
        System.out.println("4. View Booking");
        System.out.println("5. Exit");
    }
}
