package sept.ex_250924;

public class Lab071 {

    // Using break in loop

    /*
    The break statement is used to exit a loop or switch statement prematurely.
    It can be used in for, while, and do-while loops to terminate the loop
    when a certain condition is met.

    Key Points about the break statement:
    - When the break statement is executed, control is transferred to the statement
      immediately following the loop or switch.
    - It is often used in situations where continuing the loop is unnecessary or
      potentially problematic, such as when searching for a specific value.
    - Using break can enhance performance by avoiding unnecessary iterations once
      the desired condition has been fulfilled.
    - Be cautious with using break statements excessively, as they can lead to
      code that is harder to read and understand. It is generally better to
      use return statements in methods or functions when applicable.
    */

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // Loop from 0 to 9
            if (i == 5) { // Check if i is equal to 5
                System.out.println(i); // Print the current value of i
                break; // Exit the loop
            }
        }
    }
}


