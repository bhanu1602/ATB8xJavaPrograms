package Oct.ex_091024.MultipleInheritance;

// Multiple Inheritance

/*
In Java, multiple inheritance is not possible with classes. This means a class cannot extend more than one class.
In this example, if we try to make the Son class extend both Father and Mother classes, it will result in a compilation error.

This limitation is in place to avoid ambiguity, such as when both Father and Mother classes have the same method names
(e.g., money() and home()). Java would not be able to determine which method to use.

The correct way to achieve multiple inheritance in Java is by using interfaces instead of classes.
*/

// Attempting to make Son class extend both Father and Mother will not work.
public class Son /* extends Father, Mother */ {

    // The Son class can inherit from only one class at a time. Extending multiple classes is not allowed in Java.

}
