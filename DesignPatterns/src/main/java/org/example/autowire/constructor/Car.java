package org.example.autowire.constructor;

public class Car {

    private Specification specification;

        public Car(Specification specification) {
            System.out.println("INFO: Car constructor called with Specification");
            this.specification = specification;
        }

    public void displayDetails(){
        System.out.println("Car Details: " + specification.toString());
    }
}
