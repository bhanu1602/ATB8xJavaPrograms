package Oct.ex_111024.Encapsulation.Criminal; // Corrected the package name

import Oct.ex_111024.Encapsulation.ExampleOne.Police.Lab95;

public class Lab94 {

    // Thief class

    /*
    To overcome unauthorized access to the data, we have to apply proper encapsulation.
    Encapsulation ensures that critical data is not accessed or modified directly by external classes.
    */

    public static void main(String[] args) {
        Lab95 police = new Lab95(10);

        // The current implementation allows the thief (Lab94) to access the police class.
        // Even though Lab95 has encapsulation with private members, it is still accessible due to the public constructor and default toString method.
        // This issue can be solved by overriding the `toString` method and controlling what information is shared.

        System.out.println(police);

        // The thief class should not be able to access any critical data, methods like 'shoot()' or the 'gun' variable of the police class.
        // To fully achieve encapsulation, Lab95 should provide controlled access via getters or setters (if necessary).
        // In its current state, the thief has access to object details through System.out.println(police), which violates encapsulation.
    }
}

