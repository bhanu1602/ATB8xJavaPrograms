package Oct.ex_281024and301024.Collection.Stack;

import java.util.Stack;

import java.util.Stack;

public class Lab153 {
    // Demonstration of Stack Functions in Java

    /*
    Notes:
    - Stack operates on Last-In-First-Out (LIFO) principle, where the last element added is the first one to be removed.
    - The Stack class provides methods like `push`, `pop`, `peek`, and `search`, which are commonly used in scenarios requiring LIFO order.
    - Generics: Using generics allows you to restrict a Stack to hold specific types (e.g., Stack<String>), which can prevent runtime errors.
    */

    public static void main(String[] args) {

        // Default initialization (allows different object types)
        Stack<Object> stack = new Stack<>();

        // Stack with generics for String only
        Stack<String> stack1 = new Stack<>();

        // Using push() to add elements
        stack.push("a");
        stack.push("b");
        stack.push(1); // Mixed types allowed in this stack
        System.out.println("Stack with mixed types: " + stack);

        stack1.push("d");
        stack1.push("e");
        stack1.push("f");
        System.out.println("String-only stack: " + stack1);

        // Accessing the top element using peek()
        System.out.println("Top element (peek) in mixed stack: " + stack.peek());

        // Removing the top element using pop()
        System.out.println("Popped element from mixed stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Removing an element by index in stack1
        stack1.remove(1); // Removes element at index 1 (second element)
        System.out.println("String-only stack after removal: " + stack1);

        // Check if stack is empty
        System.out.println("Is the mixed stack empty? " + stack.isEmpty());

        // Searching for an element
        int position = stack.search("a");
        System.out.println("Position of element 'a' from top: " + position);
    }
}

