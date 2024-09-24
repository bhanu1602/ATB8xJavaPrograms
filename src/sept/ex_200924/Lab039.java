package sept.ex_200924;

public class Lab039 {

    // Using strings in the ternary conditional if-else statement

    public static void main(String[] args) {

        // The ternary operator checks whether the condition '10 > 20' is true
        // If true, it assigns the value "10" to the variable 'var'
        // If false, it assigns the value "Twenty" to 'var'
        String var = 10 > 20 ? "10" : "Twenty";

        // Since 10 is not greater than 20, the value "Twenty" is assigned to 'var'
        System.out.println(var);
    }
}

