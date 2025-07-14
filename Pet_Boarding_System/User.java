package Pet_Boarding_System;

abstract public class User {
    String name;
    public User(String name){
        this.name = name;
    }
    abstract public void showMenu();
}
