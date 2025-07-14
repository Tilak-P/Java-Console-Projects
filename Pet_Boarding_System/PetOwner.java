package Pet_Boarding_System;

public class PetOwner {
    private int ownerId;
    private String name;
    private String contact;

    public PetOwner(int ownerId, String name, String contact) {
        this.ownerId = ownerId;
        this.name = name;
        this.contact = contact;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public String getcontact(){
        return contact;
    }
}
