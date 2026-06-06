package org.example.startegyPattern.looseCoupling;

public class LooseCouplingExample {

    public static void main(String[] args) {

        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(userDataProvider);
        System.out.println("Using Database Provider:"+ userManagerWithDB.getUserInfo());

        UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
        UserManager webServiceUserData = new UserManager(webServiceDataProvider);
        System.out.println("Using Web Service Provider:"+ webServiceUserData.getUserInfo());

    }

}
