package org.example.autowire.name;

public class Specification {
    private String make;
    private String model;

    public String getMake() {
        System.out.println("INFO: Get Make function called");
        return make;
    }

    public void setMake(String make) {
        System.out.println("INFO: Set Make function called");
        this.make = make;
    }

    public String getModel() {
        System.out.println("INFO: Get Model function called");
        return model;
    }

    public void setModel(String model) {
        System.out.println("INFO: Set Model function called");
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
