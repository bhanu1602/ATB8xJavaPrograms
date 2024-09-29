package sept.ex_270924;

public class Task2 {

    //Print 5 even numbers using do while

    public static void main(String[] args) {

        //check con
        int i = 1;
        int count = 0;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }while (count < 5);
    }
}