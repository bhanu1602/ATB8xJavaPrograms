package Oct.ex_161024.enums;

// Separate class with the main method to demonstrate enum usage
public class Lab116 {
    public static void main(String[] args) {

        // Accessing the enum constant RED and printing its hex code using the getHexCode() method
        System.out.println("Hex code for RED: " + Lab115.RED.getHexCode()); // Output: #FF0000

        // Accessing and printing other enum constants' hex codes
        System.out.println("Hex code for GREEN: " + Lab115.GREEN.getHexCode()); // Output: #61FF33
        System.out.println("Hex code for BLUE: " + Lab115.BLUE.getHexCode()); // Output: #3377FF
        System.out.println("Hex code for YELLOW: " + Lab115.YELLOW.getHexCode()); // Output: #FFFF33
    }
}
