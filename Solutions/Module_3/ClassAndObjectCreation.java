class Car {

    String make;

    String model;

    int year;

    void displayDetails() {

        System.out.println("Car Make : " + make);

        System.out.println("Car Model : " + model);

        System.out.println("Manufacturing Year : " + year);

        System.out.println();
    }
}

public class ClassAndObjectCreation {

    public static void main(String[] args) {

        // Creating first car object
        Car car1 = new Car();

        car1.make = "Toyota";

        car1.model = "Camry";

        car1.year = 2022;

        // Creating second car object
        Car car2 = new Car();

        car2.make = "Honda";

        car2.model = "City";

        car2.year = 2021;

        // Calling method
        car1.displayDetails();

        car2.displayDetails();
    }
}