package org.example.startegyPattern.tightCoupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.displayUserDetails());
    }
}
