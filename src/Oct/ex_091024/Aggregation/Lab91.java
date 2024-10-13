package Oct.ex_091024.Aggregation;

// Class representing a Car
class Engine {

    void startEngine() {
        System.out.println("Engine is starting...");
    }
}

// Class representing a Car that "has-a" Engine
class Car {

    // Composition: Car has an Engine
    Engine engine;

    // Constructor to initialize Engine
    public Car() {
        engine = new Engine();  // Car has an Engine
    }

    void drive() {
        engine.startEngine();  // Using the Engine class inside Car
        System.out.println("Car is driving...");
    }
}

public class Lab91 {

    // Has-A Relationship (Composition)

    /*
    Notes:
    - The "Has-A" relationship, also known as composition or aggregation,
      refers to one class containing a reference to another class.
    - In this example, the `Car` class "has an" `Engine` class.
    - Composition: The Car class contains an instance of the Engine class,
      meaning a Car object is composed of an Engine object.
    */

    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car();
        car.drive();  // Starts the engine and drives the car
    }
}

