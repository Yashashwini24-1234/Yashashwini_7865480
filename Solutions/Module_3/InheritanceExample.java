class Animal {

    // Method in parent class
    void makeSound() {

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding method
    @Override
    void makeSound() {

        System.out.println("Bark");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        // Creating Animal object
        Animal animal = new Animal();

        // Creating Dog object
        Dog dog = new Dog();

        // Calling methods
        animal.makeSound();

        dog.makeSound();
    }
}