package Oct.ex_281024and301024.Collection.Stack;

import java.util.Stack;

import java.util.Stack;

public class Lab152 {

    // Demonstrating Stack in Java

    /*
    Notes:
    - Stack is a subclass of Vector, meaning it inherits properties and methods from Vector.
    - Stack operates on Last-In-First-Out (LIFO) principle, meaning the last element added is the first one to be removed.
    - Stack methods are synchronized, so it's thread-safe, but generally slower due to synchronization.

    Common Stack Methods:
    - push(E item): Pushes an item onto the top of the stack.
    - pop(): Removes and returns the top item of the stack.
    - peek(): Returns the top item without removing it.
    - empty(): Checks if the stack is empty.
    - search(Object o): Returns the 1-based position of the object from the top of the stack, or -1 if not found.
    */

    public static void main(String[] args) {

        // Declaration and Initialization
        Stack<Integer> stack = new Stack<>();

        // Using push() to add elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Initial Stack: " + stack);

        // Adding elements via helper method
        stackPush(stack);
        System.out.println("Stack after adding elements through method: " + stack);
    }

    // Method to push elements into the stack
    static void stackPush(Stack<Integer> stack) {
        for (int i = 4; i <= 8; i++) {
            stack.push(i);
        }
    }
}

