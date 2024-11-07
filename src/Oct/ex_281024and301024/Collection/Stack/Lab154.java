package Oct.ex_281024and301024.Collection.Stack;

public class Lab154 {

    public static void main(String[] args) {

        Stu s1 = new Stu("Annie", 1);
        Stu s2 = new Stu("Bob", 2);
        Stu s3 = new Stu("Jack", 3);
        Stu s4 = new Stu("John", 4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

class Stu {
    private String name;
    private Integer rollNo;

    public Stu(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    // Overriding toString method to print student details
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}

