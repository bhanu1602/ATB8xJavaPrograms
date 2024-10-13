package Oct.ex_111024.Encapsulation.Super;

public class Lab100 {

    // Use of super with methods

    /*
    - When both the parent class and child class have methods with the same name,
      the child class method overrides the parent class method.
    - The `super` keyword is used to call the parent class method in such cases, allowing you to resolve the ambiguity
      and explicitly invoke the parent class's method.
    */

    public static void main(String[] args) {
        Student s = new Student();
        s.display();  // Calls the display method which demonstrates using super with methods
    }
}

class Person {
    // Parent class method
    void message() {
        System.out.println("This is the person class");
    }
}

class Student extends Person {
    // Child class method with the same name as the parent class method
    @Override
    void message() {
        System.out.println("This is the student class");
    }

    // Method to demonstrate calling both child and parent class methods
    void display() {
        // Calls the child class's message() method
        message();  // This will call the overridden method from the Student class
        /*
        - Here, `message()` refers to the Student class method because the child class has overridden the parent class method.
        - This is an example of **method overriding**: the child class method replaces the parent class method.
        */

        // Calls the parent class's message() method using super
        super.message();  // This will call the method from the Person class
        /*
        - `super.message()` explicitly calls the method from the Person class (the parent class).
        - This allows access to the parent class's version of the method despite the child class having an overridden method with the same name.
        */
    }
}

