package Oct.ex_041024;

public class Person {

    //10 Attributes
    String name;
    int age;
    String gender;
    String address;
    String phone;
    String email;
    String hobby;
    String profession;
    String jobType;
    String education;

    Person(){
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor 1 - For personal details
    Person(String name, int age, String gender, String address, String phone, String email){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Parameterized Constructor 2 - For job details
    Person(String name, String email, String hobby, String profession, String jobType, String education){
        this.name = name;
        this.email = email;
        this.hobby = hobby;
        this.profession = profession;
        this.jobType = jobType;
        this.education = education;
    }

    //Behavior 1
    void basicDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }

    //Behavior 2
    void jobDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Profession: " + profession);
        System.out.println("Job Type: " + jobType);
        System.out.println("Education: " + education);

    }

    //Behavior 3
    void contact(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);

    }

    //Behavior 4
    void skillSet(){

        System.out.println(name + "'s hobbies include: " + hobby);
    }

    //Behavior 5
    void updateDetails(String newAddress, String newPhone, String newEmail){
        this.address = newAddress;
        this.phone = newPhone;
        this.email = newEmail;
        System.out.println("Details updated");
    }

    public static void main(String[] args) {
        //Using default constructor
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 30;
        person1.gender = "Male";
        person1.address = "1234 Elm St";
        person1.phone = "123-456-7890";
        person1.email = "john@example.com";
        person1.basicDetails();

        // Using parameterized constructor 1
        Person person2 = new Person("Amit", 28, "Male", "456 Main St", "555-555-5555", "amit@example.com");
        person2.basicDetails();

        // Using parameterized constructor 2
        Person person3 = new Person("Sarah", "sarah@example.com", "Painting", "Software Engineer", "Full-Time", "Bachelor's Degree");
        person3.jobDetails();

        // Creating and updating details using default constructor
        Person person4 = new Person();
        person4.name = "Emily";
        person4.age = 25;
        person4.address = "789 Park Ave";
        person4.phone = "987-654-3210";
        person4.updateDetails("1020 New Address", "111-111-1111", "jon@gmail.com");

        // Using parameterized constructor 2
        Person person5 = new Person("Robert", "robert@example.com", "Photography", "Graphic Designer", "Freelance", "Associate Degree");
        person5.skillSet();

    }

}
