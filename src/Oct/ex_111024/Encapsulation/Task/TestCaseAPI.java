package Oct.ex_111024.Encapsulation.Task;

public class TestCaseAPI extends BaseTestAPI {

    // Default constructor
    TestCaseAPI() {
        super(); // Calls the default constructor of the parent class
        System.out.println("TestCaseAPI: Called parent Constructor");
    }

    // Overridden method for performing GET operation
    @Override
    public void performGET() {
        System.out.println("TestCaseAPI: Overridden GET operation");
    }

    // Overridden method for performing POST operation
    @Override
    public void performPOST() {
        System.out.println("TestCaseAPI: Overridden POST operation");
    }

    // Overridden method for performing PUT operation
    @Override
    public void performPUT() {
        System.out.println("TestCaseAPI: Overridden PUT operation");
    }

    // Overridden method for performing DELETE operation
    @Override
    public void performDELETE() {
        System.out.println("TestCaseAPI: Overridden DELETE operation");
    }

    // Overridden method for performing PATCH operation
    @Override
    public void performPATCH() {
        System.out.println("TestCaseAPI: Overridden PATCH operation");
    }
}
