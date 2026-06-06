package org.example.startegyPattern.looseCoupling;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "Web Service Data Provider";
    }
}
