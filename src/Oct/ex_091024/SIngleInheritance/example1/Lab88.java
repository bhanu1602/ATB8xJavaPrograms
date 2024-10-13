package Oct.ex_091024.SIngleInheritance.example1;

public class Lab88 {

    public static void main(String[] args) {
        // Create an instance of 'Son' class
        Son s = new Son();

        // Access inherited field from 'Father' class
        System.out.println("Father's Gold (inherited): " + s.fatherHaveGold);

        // Call the method from the 'Son' class
        s.bhk3();  // Son's own method

        // Call the inherited method from the 'Father' class
        s.bhk2();  // Inherited method
    }
}

