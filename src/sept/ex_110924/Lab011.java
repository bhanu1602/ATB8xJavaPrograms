package sept.ex_110924;

// Example for Enum Type
public class Lab011 {

    // Enum Type Example
    /*
     * Enum Type: Represents a group of named constants.
     * Enum `Season` defines constants for each season of the year.
     * Used to create a variable that can be one of a predefined set of values.
     */
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        Season currentSeason = Season.SUMMER;
        switch (currentSeason) {
            case WINTER:
                System.out.println("It's cold!");
                break;
            case SPRING:
                System.out.println("Flowers are blooming.");
                break;
            case SUMMER:
                System.out.println("Time for a vacation!");
                break;
            case FALL:
                System.out.println("Leaves are falling.");
                break;
        }
    }
}
