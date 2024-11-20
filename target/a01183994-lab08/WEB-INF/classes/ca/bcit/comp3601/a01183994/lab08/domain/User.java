package ca.bcit.comp3601.a01183994.lab08.domain;

public class User {
    private String firstName;

    public User(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}