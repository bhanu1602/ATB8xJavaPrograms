package sept.ex_230924;

public class Lab058 {

    // Enum in switch

    /*
     * Notes:
     * 1. Enums (enumerations) are a special Java type used to define collections of constants. In this case, the enum `Day` represents the days of the week.
     * 2. Enums can be used as case labels in a switch statement, providing a clear and type-safe way to manage a set of constants.
     * 3. Each enum constant (e.g., `Sun`, `Mon`, etc.) is treated as an instance of the `Day` type.
     * 4. The `values()` method returns an array of all enum constants in the order they are declared, allowing iteration.
     * 5. Be cautious of missing `break` statements in the switch cases; without them, execution will fall through to subsequent cases, which may lead to unintended behavior.
     */

    public enum Day { Sun, Mon, Tue, Wed, Thu, Fri, Sat }

    public static void main(String[] args) {

        Day[] DayNow = Day.values();

        for (Day Now : DayNow) {
            switch (Now) {
                case Sun:
                    System.out.println("Sun");
                    break;
                case Mon:
                    System.out.println("Mon");
                    break;
                case Tue:
                    System.out.println("Tue");
                    break;
                case Wed:
                    System.out.println("Wed");
                    break;
                case Thu:
                    System.out.println("Thu");
                    break;
                case Fri:
                    System.out.println("Fri");
                    break;
                case Sat:
                    System.out.println("Sat");
                    break;
            }
        }
    }
}

