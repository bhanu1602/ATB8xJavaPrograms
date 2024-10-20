package Oct.ex_161024.enums;

// Enum representing different colors with hex codes
public enum Lab115 {

    /*
    Enums:
    - Represent a group of constants (fixed set of values).
    - Enums in Java are more powerful than just constants. They are a type of class and can have:
      - Constructors
      - Methods
      - Instance variables
    - Enums cannot be instantiated using the 'new' keyword.
    - Enums cannot extend other classes (because they implicitly extend java.lang.Enum).
    - Enum constants are implicitly static and final, meaning they are immutable and accessible globally.
    */

    // Enum constants with associated hex codes
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#FFFF33");  // Corrected the hex code for YELLOW for better accuracy

    // Instance variable to hold the hex code for each color
    private String hexcode;

    // Constructor for the enum, used to assign the hex code for each color
    Lab115(String hexcode) {
        this.hexcode = hexcode;
    }

    // Getter method to return the hex code of the enum constant
    public String getHexCode() {
        return hexcode;
    }
}

