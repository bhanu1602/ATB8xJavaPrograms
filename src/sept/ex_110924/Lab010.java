package sept.ex_110924;

public class Lab010 {

    // User-Defined Data Types
    // Any reference type

    /*
     * There are four main types of user-defined data types in Java:
     *
     * 1. Class Type:
     *    - A class is a blueprint for creating objects (instances) and can contain fields and methods.
     *    - Example: `public class Person { String name; int age; }`
     *
     * 2. Enum Type (introduced in Java 5):
     *    - An enum is a special type of class that represents a group of constants.
     *    - Example: `public enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }`
     *
     * 3. Interface Type:
     *    - An interface is a reference type that can contain method signatures and constants. Classes implement interfaces.
     *    - Example: `public interface Animal { void eat(); void sleep(); }`
     *
     * 4. Annotation Type (introduced in Java 5):
     *    - An annotation is a form of metadata that provides information to the compiler or runtime environment.
     *    - Example: `@Deprecated public class OldClass { public void oldMethod() {} }`
     */


        // Class Type Example
        /*
         * Class Type: Represents user-defined data types.
         * You define a class with its own methods and fields.
         * Example: `Car` class has attributes like `brand` and `year`, and a method `displayInfo` to show car details.
         */
        public static class Car {
            String brand;
            int year;

            public Car(String brand, int year) {
                this.brand = brand;
                this.year = year;
            }

            public void displayInfo() {

                System.out.println("Brand: " + brand + ", Year: " + year);
            }
        }

        public static void main(String[] args) {
            Car myCar = new Car("Toyota", 2022);
            myCar.displayInfo(); // Output: Brand: Toyota, Year: 2022
        }
    }
