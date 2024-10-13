package Oct.ex_091024.SIngleInheritance.example1;


public class Son extends Father {

    /*
    The 'Son' class inherits from the 'Father' class using the 'extends' keyword.

    Since 'Son' extends 'Father', it inherits the 'fatherHaveGold' field and the 'bhk2()' method from the 'Father' class.

    This demonstrates **Single Inheritance** where 'Son' inherits from a single superclass 'Father'.
    */

    void bhk3() {
        System.out.println("Son owns a 3BHK house.");
        System.out.println("Inherited gold from Father: " + fatherHaveGold);  // Inherited field
    }
}

