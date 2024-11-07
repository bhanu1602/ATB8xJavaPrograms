package Oct.ex_281024and301024.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab145 {
    private List<Integer> ids = new ArrayList<>();
    private List<String> names = new ArrayList<>();
    private List<Double> grades = new ArrayList<>();

    // Method to add a new student
    public void addStudent(int id, String name, double grade) {
        ids.add(id);
        names.add(name);
        grades.add(grade);
    }

    // Method to display all students
    public void displayAllStudents() {
        if (ids.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        for (int i = 0; i < ids.size(); i++) {
            System.out.println("ID: " + ids.get(i) + ", Name: " + names.get(i) + ", Grade: " + grades.get(i));
        }
    }

    // Method to find a student by ID
    public int findStudentIndexById(int id) {
        return ids.indexOf(id);
    }

    // Method to update a student's grade by ID
    public void updateStudentGrade(int id, double newGrade) {
        int index = findStudentIndexById(id);
        if (index != -1) {
            grades.set(index, newGrade);
            System.out.println("Grade updated for ID " + id + ": " + newGrade);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Method to remove a student by ID
    public void removeStudent(int id) {
        int index = findStudentIndexById(id);
        if (index != -1) {
            ids.remove(index);
            names.remove(index);
            grades.remove(index);
            System.out.println("Student with ID " + id + " removed.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Method to sort students by grade in descending order
    public void sortByGradeDescending() {
        List<Integer> tempIds = new ArrayList<>(ids);
        List<String> tempNames = new ArrayList<>(names);
        List<Double> tempGrades = new ArrayList<>(grades);

        grades.sort(Collections.reverseOrder());

        for (int i = 0; i < grades.size(); i++) {
            double grade = grades.get(i);
            int originalIndex = tempGrades.indexOf(grade);
            ids.set(i, tempIds.get(originalIndex));
            names.set(i, tempNames.get(originalIndex));
            tempGrades.set(originalIndex, -1.0);  // Prevent duplicate selection
        }

        System.out.println("Students sorted by grade in descending order:");
        displayAllStudents();
    }

    public static void main(String[] args) {
        Lab145 manager = new Lab145();

        // Adding students
        manager.addStudent(1, "Alice", 85.5);
        manager.addStudent(2, "Bob", 92.3);
        manager.addStudent(3, "Charlie", 78.4);

        // Displaying all students
        System.out.println("All students:");
        manager.displayAllStudents();

        // Searching for a student by ID
        System.out.println("Searching for student with ID 2:");
        int index = manager.findStudentIndexById(2);
        if (index != -1) {
            System.out.println("Found student with ID 2: Name: " + manager.names.get(index) + ", Grade: " + manager.grades.get(index));
        } else {
            System.out.println("Student with ID 2 not found.");
        }

        // Updating grade for a student
        manager.updateStudentGrade(1, 88.0);

        // Sorting by grade
        manager.sortByGradeDescending();

        // Removing a student
        manager.removeStudent(3);
        manager.displayAllStudents();
    }
}

