package Pet_Boarding_System;

public class Pet {
    private String petId;
    private String name;
    private String ptype;
    private PetOwner owner;

    public Pet(String petId, String name, PetOwner owner, String ptype) {
        this.petId = petId;
        this.name = name;
        this.ptype = ptype;
        this.owner = owner;
    }

    public String getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public String getPtype() {
        return ptype;
    }

    public PetOwner getOwner() {
        return owner;
    }
}
