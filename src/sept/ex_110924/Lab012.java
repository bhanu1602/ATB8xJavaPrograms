package sept.ex_110924;

// Example for Interface Type
public class Lab012 {

    // Interface Type Example
    /*
     * Interface Type: Defines a contract for classes to implement.
     * `Vehicle` interface specifies methods `start` and `stop`.
     * The `Bike` class implements the `Vehicle` interface and provides the behavior for these methods.
     */
    public interface Vehicle {
        void start();
        void stop();
    }

    public static class Bike implements Vehicle {
        public void start() {
            System.out.println("Bike started.");
        }

        public void stop() {
            System.out.println("Bike stopped.");
        }
    }

    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.start(); // Output: Bike started.
        myBike.stop();  // Output: Bike stopped.
    }
}
