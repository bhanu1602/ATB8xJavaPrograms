package Oct.ex_111024.Encapsulation.Example;

public class Lab97 {
    public static void main(String[] args) {
        Lab96 login = new Lab96("admin", "admin");
        System.out.println(login.username);
        login.username = "admin1"; //without encapsulation we change the data
        System.out.println(login.username);

    }
}
