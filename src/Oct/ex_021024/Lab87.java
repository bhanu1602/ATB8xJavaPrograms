package Oct.ex_021024;

public class Lab87 {
    public static void main(String[] args) {

        /*
        Key Points:

        - **Class Loading in JVM**:
          - When the `ATBStudent` class is used in the program, it is first loaded by the ClassLoader subsystem of the JVM.
          - After the class is loaded, it gets stored in the **Method Area**, where the class structure (like methods, attributes) is held.

        - **Heap Memory Allocation**:
          - Once the `ATBStudent` object is instantiated using the `new` keyword, memory is allocated to the object on the **heap**.
          - Reference variables (`amit` and `abhishe`) are stored in the **stack**, while the actual object data is stored in the heap memory.

        - **Reference Variables**:
          - A reference variable (`amit`, `abhishe`) points to the object created on the heap.
          - By default, reference variables are initialized to `null` before pointing to any object.
          - The reference variable stores a memory address (typically a 64-bit address on a 64-bit machine) that points to the location of the object in the heap.

        - **Object Creation**:
          - The line `ATBStudent amit = new ATBStudent();` creates a new object of type `ATBStudent`.
          - The object `amit` is now a reference to the newly created `ATBStudent` object in the heap.

        - **Memory Allocation**:
          - The size of the reference variable itself depends on the machine architecture (typically 8 or 64 bits on 64-bit systems).
          - The actual object size depends on the number and type of attributes defined in the `ATBStudent` class (e.g., `age`, `name`).

        - **Default toString() Method**:
          - When you print `System.out.println(amit);`, it will print the default memory address in a form like `ATBStudent@hashcode`.
          - The `@hashcode` part is generated by the default `toString()` method from the `Object` class, which outputs the class name followed by the object's memory address in hexadecimal.

        */

        ATBStudent amit = new ATBStudent(); // Object created, 'amit' is a reference variable for the object
        amit.age = 45; // Setting the age attribute of 'amit'

        ATBStudent abhishe = new ATBStudent(); // Another object created, 'abhishe' is a reference variable
        abhishe.age = 49; // Setting the age attribute of 'abhishe'

        System.out.println(amit); // Prints the memory address/reference of 'amit'
    }
}

