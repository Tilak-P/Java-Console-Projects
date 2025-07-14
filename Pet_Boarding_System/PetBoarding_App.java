package Pet_Boarding_System;

import java.util.ArrayList;
import java.util.Scanner;

public class PetBoarding_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager manager = new Manager("Tilak");
        ArrayList<PetOwner> owners = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<Boarding> bookings = new ArrayList<>();

        rooms.add(new Room(101,500));
        rooms.add(new Room(102,700));
        rooms.add(new Room(103,1000));

        int ownerIdCounter = 1;

        while (true){
            manager.showMenu();
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
           sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter Owner Name");
                    String ownerName = sc.nextLine();
                    System.out.println("Enter Owner Contact");
                    String contact = sc.nextLine();
                    owners.add(new PetOwner(ownerIdCounter++,ownerName,contact));
                    System.out.println("Owner Registered");
                    break;

                case 2:
                    if(owners.isEmpty()){
                        System.out.println("Add Owner first");
                        break;
                    }
                    System.out.println("Available Owners");
                    for(PetOwner o : owners){
                        System.out.println(o.getOwnerId() + ": " + o.getName());
                    }
                    System.out.println("Enter Owner ID:");
                    int oid = sc.nextInt();
                    sc.nextLine();

                    PetOwner selectedOwner = null;
                    for(PetOwner o: owners){
                        if(o.getOwnerId() == oid){
                            selectedOwner = o;
                            break;
                        }
                    }
                    if(selectedOwner == null){
                        System.out.println("Invalid Owner");
                        break;
                    }
                    System.out.println("Enter Pet ID:");
                    String pid = sc.nextLine();
                    System.out.println("Enter Pet Name:");
                    String pname = sc.nextLine();
                    System.out.println("Enter Pet Type:");
                    String ptype = sc.nextLine();

                    pets.add(new Pet(pid,pname,selectedOwner,ptype));
                    System.out.println("Pets Registered");
                    break;

                case 3:
                    if(pets.isEmpty()){
                        System.out.println("Add Pets First");
                        break;
                    }
                    System.out.println("Available Pets:");
                    for(int i=0;i< pets.size();i++){
                        System.out.println((i+1) + ". " + pets.get(i).getName() + " (" + pets.get(i).getPtype() + ")");
                    }
                    System.out.println("Select Pet Number");
                    int petIndex = sc.nextInt()-1;
                    sc.nextLine();

                    System.out.println("Available Rooms:");
                    for(Room r:rooms){
                        System.out.println(r.getRoomNumber() + " Rs." + r.getPricePerDay());
                    }
                    System.out.println("Enter Room Number");
                    int roomNo = sc.nextInt();

                    Room selectedRoom  = null;
                    for(Room r:rooms){
                        if(r.getRoomNumber() == roomNo){
                            selectedRoom = r;
                            break;
                        }
                    }
                        if(selectedRoom == null){
                            System.out.println("Invalid Room");
                            break;
                        }
                        System.out.println("Enter Number of Days");
                        int days = sc.nextInt();
                        sc.nextLine();

                        bookings.add(new Boarding(pets.get(petIndex),selectedRoom,days));
                        System.out.println("Booking Confirmed");
                        break;

                case 4:
                    if(bookings.isEmpty()){
                        System.out.println("No Bookings");
                        break;
                    }
                    System.out.println("Bookings:");
                    for(Boarding b:bookings){
                        b.display();
                    }
                    break;

                case 5:
                    System.out.println("Exit Successful");
                    System.exit(0);
                    break;
            }
        }
    }
}
