package Oct.ex_231024;

public class Lab133 {

    /*
    Important Points:

    1. `throw` is used to explicitly throw an exception, and the object being thrown must be of a subclass of `Throwable`.
    2. `Exception`, `Error`, and `Throwable` can be thrown using `throw new`, but objects of `Object` or other classes that don't extend `Throwable` cannot be thrown.

    3. `catch` blocks are used to handle exceptions. The parameter in the `catch` block must be a subclass of `Throwable`.
    4. `Exception`, `Error`, and `Throwable` can be caught, but an `Object` or any non-Throwable class cannot be caught.

    Examples:
    ---------------------------------
    throw new Exception();      // Ok
    throw new Error();          // Ok
    throw new Throwable();      // Ok

    throw new Object();         // Not Ok, Object does not extend Throwable

    catch(Exception){}          // Ok
    catch(Error){}              // Ok
    catch(Throwable){}          // Ok

    catch(Object){}             // Not Ok, Object does not extend Throwable

    Method Declarations:
    ---------------------------------
    void m1() throws Exception  // Ok
    void m1() throws Error      // Ok
    void m1() throws Throwable  // Ok

    void m1() throws Object     // Not Ok, Object does not extend Throwable

    5. **`Throwable` is the superclass** for both exceptions (`Exception`) and errors (`Error`), hence anything that extends `Throwable` can be thrown or caught.
    */

    // Example of throwing exceptions
    public static void throwException() throws Exception {
        throw new Exception("This is an Exception.");
    }

    public static void throwError() throws Error {
        throw new Error("This is an Error.");
    }

    public static void throwThrowable() throws Throwable {
        throw new Throwable("This is a Throwable.");
    }

    // Catching exceptions
    public static void catchExample() {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }

        try {
            throwError();
        } catch (Error e) {
            System.out.println("Caught Error: " + e);
        }

        try {
            throwThrowable();
        } catch (Throwable e) {
            System.out.println("Caught Throwable: " + e);
        }

        // You cannot catch an Object because it does not extend Throwable
        /*
        try {
            throw new Object();   // Not Ok, Object does not extend Throwable
        } catch (Object e) {
            System.out.println("Caught Object: " + e); // This will not compile
        }
        */
    }

    // Methods that declare different throws clauses
    public static void method1() throws Exception {
        // Ok, as Exception extends Throwable
    }

    public static void method2() throws Error {
        // Ok, as Error extends Throwable
    }

    public static void method3() throws Throwable {
        // Ok, as Throwable is the superclass of all exceptions and errors
    }

    // This method declaration will cause a compile-time error
    /*
    public static void method4() throws Object {
        // Not Ok, Object does not extend Throwable
    }
    */

    public static void main(String[] args) {
        // Calling the method that demonstrates exception handling
        catchExample();
    }
}

