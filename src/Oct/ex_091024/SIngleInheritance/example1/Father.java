package Oct.ex_091024.SIngleInheritance.example1;

public class Father {

    /*
    Inheritance in Java is considered as inheriting properties (fields and methods) of another class.
    It allows for creating a class based on an existing one, promoting reusability and reducing redundancy.

    - Class: A blueprint for creating objects, representing common characteristics/behavior. It's not a real entity.

    - Superclass/Parent class: The class from which properties and behaviors are inherited.
    - Subclass/Child class: The class that inherits from the superclass. It can access and use the methods/fields from the superclass.

    - Reusability: Inheritance allows for code reuse, reducing the need to write repetitive code.

    **Inheritance uses the 'extends' keyword** to inherit the properties of a parent class.

    Types of Inheritance:
    ---------------------
    1. Single Inheritance:
        A subclass inherits from a single superclass.
    2. Multilevel Inheritance:
        A subclass inherits from a superclass, which is also a subclass of another class.
    3. Hierarchical Inheritance:
        Multiple subclasses inherit from a single superclass.
    4. Multiple Inheritance (Not Supported in Java through classes):
        A class inherits from more than one class. Java does not support this directly with classes,
        but it can be achieved through interfaces.
    5. Hybrid Inheritance:
        A combination of multiple types of inheritance. Achievable using interfaces in Java.
    */

    // Single Inheritance

    /*
    In Single Inheritance, a subclass is derived from a single parent class (superclass).
    The subclass inherits behavior or attributes of that one parent class.

    Here, the 'Father' class is the parent class, and 'Son' will be the subclass.
    */

    int fatherHaveGold = 1000;  // Parent class attribute

    // Parent class method
    void bhk2() {
        System.out.println("Father has gold: " + fatherHaveGold + " and owns a 2BHK house.");
    }
}

