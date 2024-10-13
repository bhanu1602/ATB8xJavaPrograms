package Oct.ex_111024.Encapsulation.AccessModifiers;

public class Lab95 {

    // Access Modifiers

    /*
    Java provides four access modifiers:

    1. **public**:
       - The `public` access modifier allows the member (variable or method) to be accessible from anywhere (within the same class, other classes, other packages).

    2. **private**:
       - The `private` access modifier restricts the visibility of a member to only within the same class. It cannot be accessed from outside the class, even by subclasses or classes in the same package.

    3. **protected**:
       - The `protected` access modifier allows the member to be accessed within the same package and also by subclasses (even in different packages).

    4. **default** (package-private):
       - If no access modifier is specified, it is considered default (also called package-private).
       - This means the member is accessible only within the same package.

    Note: The default access modifier is **not** `public`. It allows access only within the same package.
    */

    // Fields with different access levels
    public String name;       // Public: Accessible from anywhere
    private int age;          // Private: Accessible only within this class
    protected int ID;         // Protected: Accessible within the same package and by subclasses

    // Private fields should typically be accessed or modified using getter and setter methods.

    // Getter and setter for 'age' (private field)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Public field 'name' can be accessed and modified directly, but this can be controlled with getters and setters if needed.

    // Protected field 'ID' can be directly accessed within the package or subclasses, or controlled with getters/setters if desired.
}

