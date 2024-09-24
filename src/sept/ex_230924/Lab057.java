package sept.ex_230924;

public class Lab057 {

    // Nested Switch Statement

    /*
     * Notes:
     * 1. A nested switch statement allows you to use a switch within another switch. This is useful for scenarios where you need to make multiple selections based on different criteria.
     * 2. Each nested switch can handle its own variable or expression.
     * 3. Be cautious with nesting as it can lead to complex and hard-to-read code if overused.
     * 4. Ensure proper handling of break statements to avoid fall-through behavior in nested switches.
     * 5. This structure is helpful in scenarios such as course selection, where you might want to select a department and then choose a specific course within that department.
     */

    public static void main(String[] args) {

        // Example course selection
        String department = "Science";
        String course = "Biology";

        switch (department) {
            case "Science":
                switch (course) {
                    case "Biology":
                        System.out.println("You selected Biology.");
                        break;
                    case "Chemistry":
                        System.out.println("You selected Chemistry.");
                        break;
                    default:
                        System.out.println("Unknown course in Science.");
                }
                break;
            case "Arts":
                switch (course) {
                    case "History":
                        System.out.println("You selected History.");
                        break;
                    case "Literature":
                        System.out.println("You selected Literature.");
                        break;
                    default:
                        System.out.println("Unknown course in Arts.");
                }
                break;
            default:
                System.out.println("Unknown department.");
        }
    }
}

