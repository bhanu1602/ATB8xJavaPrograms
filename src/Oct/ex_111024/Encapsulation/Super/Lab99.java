package Oct.ex_111024.Encapsulation.Super;

public class Lab99 {

    /*
    The `super` keyword is used to refer to the parent class when working with objects.
    It is used in the context of inheritance and polymorphism.
    The `super` keyword is used to call the superclass constructor, methods, or fields.

    Key Points:
    1. `super` must be the first statement in a constructor.
    2. `super` cannot be used in static contexts.
    3. You don’t always need to explicitly call `super` to invoke a superclass method unless you want to override behavior.


    // Super keyword with variables

    /*
    - The `super` keyword is used to refer to variables in the parent class, allowing the subclass to access the
      parent class's fields even when the subclass has fields with the same name.
    - This is particularly useful in cases where both the parent class and child class have variables with the same name.
    - `super` allows the subclass to distinguish between its own variables and those inherited from the superclass.
    */

    public static void main(String[] args) {
        Car small = new Car();
        small.display();  // Calls display method which demonstrates the use of super with variables
    }
}

class Vehicle {
    // Parent class variable
    int maxSpeed = 180;  // This variable will be hidden by the Car class's maxSpeed variable when accessed from Car
}

class Car extends Vehicle {
    // Subclass variable
    int maxSpeed = 200;  // This variable hides the parent class variable with the same name

    // Method to display both the subclass's maxSpeed and the superclass's maxSpeed
    void display() {
        // Displays the maxSpeed from the Car class (i.e., the subclass variable)
        System.out.println("Car's max speed: " + maxSpeed);

        /*
        - Here, `maxSpeed` refers to the subclass's variable because the subclass has its own `maxSpeed` field.
        - This is an example of **variable shadowing**: the subclass's variable hides the parent class's variable
          when accessed directly.
        */

        // Accessing the Vehicle's maxSpeed using the `super` keyword
        System.out.println("Vehicle's max speed using super: " + super.maxSpeed);

        /*
        - `super.maxSpeed` explicitly accesses the `maxSpeed` variable from the Vehicle class (the parent class).
        - This resolves the shadowing issue by allowing the subclass to refer to the parent class variable
          despite having its own variable with the same name.
        */
    }
}

