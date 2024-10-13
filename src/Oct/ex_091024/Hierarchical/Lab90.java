package Oct.ex_091024.Hierarchical;

public class Lab90 {

    // Hierarchical Inheritance

    /*
    Notes:
    - Hierarchical inheritance occurs when multiple classes inherit from a single parent class.
    - In this example, both Son1 and Son2 extend the Father class.
    - This means Son1 and Son2 inherit all the methods of Father, such as the home() method.
    - Each child class (Son1 and Son2) can also have its own unique methods (ruhan() in Son1 and suhan() in Son2).
    - In the main method, we create objects of Father, Son1, and Son2 and call their respective methods.
    */

    public static void main(String[] args) {

        // Creating an instance of Father and calling its method
        Father father = new Father();
        father.home(); // Calls Father's home() method

        // Creating an instance of Son1 and calling its methods
        Son1 son1 = new Son1();
        son1.ruhan();  // Calls Son1's ruhan() method
        son1.home();   // Inherited method from Father

        // Creating an instance of Son2 and calling its methods
        Son2 son2 = new Son2();
        son2.home();   // Inherited method from Father
        son2.suhan();  // Calls Son2's suhan() method
    }
}
