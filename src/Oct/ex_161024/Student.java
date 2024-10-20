package Oct.ex_161024;

     //When to use static variables and methods?

    /*
    When same property shared among all objects
     */

    //Example student class, all students have same college name

    public class Student {
        // Static variables for shared properties
        static String collegeName; // Shared college name among all students
        static int counter = 0; // Counter for roll numbers

        // Instance variables
        String name;
        int rollNo;

        // Constructor to initialize the student's name and assign a roll number
        public Student(String name) {
            this.name = name;
            this.rollNo = setRollNo(); // Assign roll number using static method
        }

        // Static method to set the roll number for each student
        static int setRollNo() {
            counter++;
            return counter; // Return the current roll number
        }

        // Static method to set the college name
        static void setCollegeName(String collegeName) {
            Student.collegeName = collegeName; // Correctly assign the static variable
        }

        // Method to display student information
        void getStudentInfo() {
            System.out.println("Name: " + this.name);
            System.out.println("Roll No: " + this.rollNo);
            System.out.println("College Name: " + collegeName); // Accessing static variable
        }

        public static void main(String[] args) {
            // Setting the college name
            Student.setCollegeName("XYZ College");

            // Creating student instances
            Student s1 = new Student("Alice");
            Student s2 = new Student("Bob");

            // Displaying student information
            s1.getStudentInfo();
            s2.getStudentInfo();
        }
    }

