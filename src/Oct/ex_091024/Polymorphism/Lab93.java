package Oct.ex_091024.Polymorphism;

class Animal {

    // Method in the parent class
    void sound() {
        System.out.println("This animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding the sound method in the Dog class
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {

    // Overriding the sound method in the Cat class
    @Override
    void sound() {
        System.out.println("The cat meows");
    }
}

public class Lab93 {

    // Method Overriding

    /*
    Notes:
    - Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its parent class.
    - In this example, both the `Dog` and `Cat` classes override the `sound()` method of the `Animal` class.
    - Method overriding occurs when:
      1. The method in the child class has the same name as the method in the parent class.
      2. The method has the same parameters (signature) as the method in the parent class.
      3. There is an inheritance relationship between the parent and child class.
    - The `@Override` annotation is optional but it helps identify overridden methods clearly.
    */

    public static void main(String[] args) {
        // Creating an Animal reference for Dog object
        Animal myDog = new Dog();
        myDog.sound();  // Calls the overridden method in Dog

        // Creating an Animal reference for Cat object
        Animal myCat = new Cat();
        myCat.sound();  // Calls the overridden method in Cat

        // Creating an Animal reference for Animal object
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Calls the original method in Animal
    }
}
