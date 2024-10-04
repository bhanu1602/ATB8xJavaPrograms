package Oct.ex_021024;

public class ATB {

    String name;
    String city;
    int age;
    String course;
    int sid;

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Sid: " + sid);
    }

    public static void main(String[] args) {

        // Object 1
        ATB a = new ATB();
        a.age = 20;
        a.name = "Raj";
        a.course = "Automation";
        a.sid = 1;
        a.city = "Mumbai";

        // Object 2
        ATB b = new ATB();
        b.age = 22;
        b.name = "Priya";
        b.course = "Manual Testing";
        b.sid = 2;
        b.city = "Pune";

        // Object 3
        ATB c = new ATB();
        c.age = 21;
        c.name = "Amit";
        c.course = "DevOps";
        c.sid = 3;
        c.city = "Delhi";

        // Object 4
        ATB d = new ATB();
        d.age = 23;
        d.name = "Kiran";
        d.course = "Automation";
        d.sid = 4;
        d.city = "Bangalore";

        // Object 5
        ATB e = new ATB();
        e.age = 19;
        e.name = "Sneha";
        e.course = "API Testing";
        e.sid = 5;
        e.city = "Chennai";

        a.displayInfo();
        b.displayInfo();
        c.displayInfo();
        d.displayInfo();
        e.displayInfo();

    }
}
