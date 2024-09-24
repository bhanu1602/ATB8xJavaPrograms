package sept.ex_180924;

public class Lab036_extra {

    public static void main(String[] args) {

        // Object Casting (Upcasting and Downcasting)
        // ==========================================

        // Upcasting: Assigning a subclass object to a superclass reference
        Animal animal = new Dog();  // Upcasting happens automatically
        animal.speak();  // Calls the Dog's speak method

        // Downcasting: Assigning a superclass reference back to a subclass object
        // Requires explicit cast and a type check (using instanceof)
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  // Downcasting must be explicit
            dog.bark();  // Calls the Dog's specific method
        }

        // Parsing Strings to Primitive Types
        // ===================================
        // Cannot directly cast a String to a primitive type; you must use parsing methods.
        String numStr = "123";
        int num = Integer.parseInt(numStr);  // Converts String to int
        System.out.println("String to int: " + num);

        String doubleStr = "45.67";
        double doubleNum = Double.parseDouble(doubleStr);  // Converts String to double
        System.out.println("String to double: " + doubleNum);

        // Narrowing Casting (Manual Conversion)
        // =====================================
        // Large data types to small ones
        double largeValue = 123.456;
        int narrowedValue = (int) largeValue;  // Narrowing must be explicit
        System.out.println("Narrowing double to int: " + narrowedValue);  // Fractional part lost

        // Casting Incompatible Types
        // ==========================
        // Example: Cannot cast unrelated types like String to int directly.
        // Uncommenting the following line will cause a compile-time error.
        // int errorValue = (int) "string";  // Invalid cast

        // Wrapper Class Casting (Autoboxing and Unboxing)
        // ==============================================
        Integer wrapperInt = 100;  // Autoboxing: int to Integer object
        Number number = wrapperInt;  // Widening: Integer to Number object (automatically)

        // Downcasting Number to Integer (requires explicit cast)
        if (number instanceof Integer) {
            Integer downcastedInt = (Integer) number;  // Manual downcast
            System.out.println("Downcasted Integer: " + downcastedInt);
        }
    }
}

// Class definitions to demonstrate object casting
class Animal {
    public void speak() {
        System.out.println("Animal is speaking");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }

    public void bark() {
        System.out.println("Dog-specific method: Bark");
    }
}

