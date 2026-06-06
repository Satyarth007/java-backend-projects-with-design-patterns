package org.example.startegyPattern.tightCoupling;

public class UserManager {

    UserDatabase userDatabase = new UserDatabase();

    public String displayUserDetails() {
        return userDatabase.getUserDetails();
    }
}
