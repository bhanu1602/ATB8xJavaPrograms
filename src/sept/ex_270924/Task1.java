package sept.ex_270924;

public class Task1 {

    // Example of while and do-while loop

    // Method for while loop example
    public void whileLoop() {
        int i = 1;
        while (i <= 1) {
            System.out.println(i);
            i++;
        }
    }

    // Method for do-while loop example
    public void doWhileLoop() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 1);
    }

    public static void main(String[] args) {
        Task1 task = new Task1();

        // Calling the while loop method
        task.whileLoop();

        // Calling the do-while loop method
        task.doWhileLoop();
    }
}

