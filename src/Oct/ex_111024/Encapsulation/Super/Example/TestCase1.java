package Oct.ex_111024.Encapsulation.Super.Example;

public class TestCase1 extends BaseClass {

    // Default constructor for TestCase1
    TestCase1() {
        super();  // Calls the default constructor of the parent class (BaseClass)
        this.setBrowser("Chrome", true);  // Sets the browser using the overridden method
    }

    // Overridden method to set the browser with additional logic
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("own logic");  // Custom logic before calling the parent method
        super.setBrowser(browser, isAuth);  // Calls the parent class's setBrowser method
    }
}

