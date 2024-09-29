package sept.ex_250924;

public class Lab066 {

    public static void main(String[] args) {

        // The condition `i > 0` is false right from the start since `i` is initialized to 0.
        // Therefore, the loop body will never be executed.
        for (int i = 0; i > 0; i--) { // Loop condition `i > 0` fails on the first check
            System.out.println(i);  // This statement will never be executed
        }
    }
}

