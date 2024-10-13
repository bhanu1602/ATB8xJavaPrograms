package Oct.ex_111024.Encapsulation.Task;

public class APIAutomation {

    public static void main(String[] args) {
        // Dynamic dispatch BaseTestAPI reference pointing to TestCaseAPI object
        BaseTestAPI baseTestAPI = new TestCaseAPI();

        // Performing various HTTP operations using the TestCaseAPI implementation
        baseTestAPI.performGET();      // Calls the overridden performGET method
        baseTestAPI.performPOST();     // Calls the overridden performPOST method
        baseTestAPI.performPUT();      // Calls the overridden performPUT method
        baseTestAPI.performDELETE();   // Calls the overridden performDELETE method
        baseTestAPI.performPATCH();     // Calls the overridden performPATCH method

        // Using the setter methods from BaseTestAPI to set values
        baseTestAPI.setId(10);         // Setting the ID to 10
        baseTestAPI.setName("BP");     // Setting the name to "BP"

        //Printing values
        System.out.println("ID set to: " + baseTestAPI.getId());
        System.out.println("Name set to: " + baseTestAPI.getName());
    }
}
