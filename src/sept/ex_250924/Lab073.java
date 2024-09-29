package sept.ex_250924;

public class Lab073 {

    //print odd and even numbers from the given range

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            if(i % 2 == 0){
                System.out.println("The even number " + i);
                continue;
            }
            System.out.println("The odd num is " + i);
        }
    }
}
