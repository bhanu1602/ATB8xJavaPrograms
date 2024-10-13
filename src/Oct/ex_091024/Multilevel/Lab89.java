package Oct.ex_091024.Multilevel;

public class Lab89 {

    // Multi-level Inheritance

    /*
    Notes:
    - Multi-level inheritance occurs when a class (Son) inherits from another class (Father),
      which in turn inherits from another class (GrandFather).
    - In this example, GrandFather -> Father -> Son, forming a multi-level hierarchy.
    - The `Son` class overrides the `home()` and `money()` methods from its parent (Father),
      and Father overrides these methods from its parent (GrandFather).
    - The `car()` method is unique to the Father class and is inherited by the Son class.
    - In the `main` method, we create an object of the `Son` class, which has access to
      methods from both Father and GrandFather through inheritance.
    */

    public static void main(String[] args) {

        Son s = new Son();
        // Calling overridden methods from the Son class
        s.home();  // Calls Son's home() method
        s.money(); // Calls Son's money() method
        // Calling inherited method from Father class
        s.car();   // Calls Father's car() method

    }
}