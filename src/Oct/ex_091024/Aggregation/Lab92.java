package Oct.ex_091024.Aggregation;

// Parent class representing a general Animal
class Animal {

    void sound() {
        System.out.println("This animal makes a sound");
    }
}

// Child class representing a specific Dog, which "is-a" Animal
class Dog extends Animal {

    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

// Another child class representing a Cat, which "is-a" Animal
class Cat extends Animal {

    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("The cat meows");
    }
}

public class Lab92 {

    // Is-A Relationship (Inheritance)

    /*
    Notes:
    - The "Is-A" relationship refers to inheritance in Java.
    - In this example, both `Dog` and `Cat` classes inherit from the `Animal` class.
    - This means that `Dog` is-a `Animal` and `Cat` is-a `Animal`.
    - This relationship is implemented using the `extends` keyword in Java.
    - All subclasses inherit the properties and methods of the parent class.
    */

    public static void main(String[] args) {
        // Creating a Dog object
        Dog dog = new Dog();
        dog.sound();  // Calls the overridden method in Dog

        // Creating a Cat object
        Cat cat = new Cat();
        cat.sound();  // Calls the overridden method in Cat

        // General Animal reference
        Animal animal = new Animal();
        animal.sound();  // Calls the method in Animal
    }
}

