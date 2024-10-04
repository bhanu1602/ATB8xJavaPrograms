package Oct.ex_041024;

public class Dog {
    // Example for constructor
    /*
     * A constructor is a special method used to initialize an object. Constructors in Java:
     * - Have the same name as the class.
     * - Do not have a return type.
     * - Are called automatically when an object is created.
     *
     * There are two types of constructors:
     * 1. Default Constructor: A constructor that takes no parameters and assigns default values to object fields.
     * 2. Parameterized Constructor: A constructor that takes arguments to initialize object fields with custom values.
     *
     * Key Points:
     * - Constructor overloading: You can have multiple constructors with different parameter lists (number, type, or order of parameters).
     * - The `this` keyword: Used to refer to the current object and to differentiate between instance variables and parameters with the same name.
     * - Constructor chaining: A constructor can call another constructor within the same class using `this()` (must be the first statement).
     * - Superclass constructor: You can call the constructor of a superclass using `super()` if you are working with inheritance.
     * - Constructors do not have a return type, but they return the object instance implicitly.
     *
     * Additional Notes:
     * - Constructors are not inherited by subclasses.
     * - Objects created by constructors are automatically garbage collected when no references exist.
     */

    // Instance variables
    String name;
    int age;
    String gender;
    String breed;

    // Default constructor
    Dog(){
        System.out.println("I am the default constructor");
        // Fields are automatically initialized to default values (null for strings, 0 for integers, etc.)
    }

    // Parameterized constructor with one parameter
    Dog(String name) {
        System.out.println("I am a parameterized constructor with name");
        this.name = name;  // The 'this' keyword refers to the current object's instance variables
    }

    // Parameterized constructor with multiple parameters
    Dog(String name, int age, String gender, String breed) {
        System.out.println("I am a parameterized constructor with multiple fields");
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects of the Dog class using different constructors

        Dog dog = new Dog();  // Calls default constructor
        Dog germanShepard = new Dog("GermanShepard");  // Calls constructor with 1 parameter
        Dog gradeDane = new Dog("Poo", 2, "Male", "GradeDane");  // Calls constructor with 4 parameters

        // Outputting object details
        System.out.println("Default constructor - dog object: " + dog);  // Will print object reference
        System.out.println("Parameterized constructor - germanShepard name: " + germanShepard.name);  // Accessing name field
        System.out.println("Parameterized constructor - gradeDane details:");
        System.out.println("Name: " + gradeDane.name);
        System.out.println("Age: " + gradeDane.age);
        System.out.println("Gender: " + gradeDane.gender);
        System.out.println("Breed: " + gradeDane.breed);
    }
}

