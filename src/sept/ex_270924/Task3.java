package sept.ex_270924;

public class Task3 {
    //sum of 100 numbers using while
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        while (i <= 100) {
            sum = sum + i;
            System.out.println(sum);
            i++;
        }
    }
}
