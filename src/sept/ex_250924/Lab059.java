package sept.ex_250924;

public class Lab059 {

    //loops - condition which is used to control the execution flow

    /*
     * Notes:
     * 1. The `for` loop is a control structure that allows repeated execution of a block of code.
     * 2. The loop consists of three parts:
     *    - Initialization: This runs once before the loop starts. In this case, `i = 0`.
     *    - Test Expression: The loop runs as long as this expression is `true`. Here, `i < 10` controls the loop to stop when `i` reaches 10.
     *    - Update Expression: This is executed after every iteration of the loop. In this case, `i++` increments `i` by 1 after every loop iteration.
     * 3. `i++` (post-increment) and `++i` (pre-increment) behave the same in this case because the increment happens after the current value of `i` is used in the condition.
     * 4. The loop will stop once the test expression `i < 10` is false, i.e., when `i` becomes 10.
     * 5. The variable `i` can be declared outside the loop to be used later in the code if needed, or inside the loop if its scope is restricted to the loop.
     * 6. You can use both increment and decrement operators (`i++`, `i--`) to control the loop counter as needed.
     * 7. You can control the starting point, ending condition, and how much you increment/decrement the loop variable to suit the program's needs.
     */

    public static void main(String[] args) {

        int i; // Declared outside for later use

        for(i = 0; i < 10; i++) {  // prints from 0 to 9 when it is <, i++ and ++i are same here
            System.out.println(i);
        }
    }
}

