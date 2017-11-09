package main.java;

/* Create a class called User that inherits from Person */
public class User {

    /* Add a protected property called isAdmin that is a boolean */
    protected boolean isAdmin;

    /* Accept a 3rd parameter, a boolean of whether or not that user is an administrator */
    public User(String firstName, String lastName, boolean isAdmin) {
        super(firstName, lastName);
        this.isAdmin = isAdmin;
    }

    /* Returns a boolean if the contact is an administrator */
    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return String.format("%s %s is administrator? %b", firstName, lastName, isAdmin);
    }
}