package Oct.ex_111024.Encapsulation.Super;

public class Lab101 {

    // Super with constructors
    /*
    - The `super` keyword is used to call a parent class constructor from a child class.
    - It can call both parameterized and non-parameterized constructors based on the context.
    - If no explicit call to `super()` is made, the compiler automatically inserts a call to the parent class's no-argument constructor.
    */

    public static void main(String[] args) {
        Student1 s = new Student1();  // Creates an instance of Student1
        // This triggers the constructor chain: Person1 -> Student1
    }
}

class Person1 {

    // No-argument constructor for Person1
    Person1() {
        System.out.println("Person 1 Constructor");  // Output when Person1's constructor is called
    }
}

class Student1 extends Person1 {

    // No-argument constructor for Student1
    Student1() {
        super();  // Calls the no-argument constructor of Person1
        System.out.println("Student1 Constructor");  // Output when Student1's constructor is called
    }
}
