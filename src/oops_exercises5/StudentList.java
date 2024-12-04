package oops_exercises5;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    private ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        Student student = new Student();
        student.addStudent();
        students.add(student);
        System.out.println("Student added successfully");

    }

    public void deleteStudentById() {
        System.out.println("Enter id of student to delete: ");
        String idToDelete = sc.nextLine();
        for (Student student : students) {
            if (student.getId().equals(idToDelete)) {
                students.remove(student);
                System.out.println("Student deleted");
                return;
            }
        }
        System.out.println("Not found student");

    }

    public void findStudentByID() {
        System.out.println("Enter id of student to search: ");
        String idToFind = sc.nextLine();
        for (Student student : students) {
            if (student.getId().equals(idToFind)) {
                System.out.println("Student found: ");
                student.displayInfo();
                System.out.println("-------------------");
                return;
            }
        }
        System.out.println("Not found student.");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.err.println("No students in list");
        } else {
            System.out.println("All students: ");
            for (Student student : students) {
                student.displayInfo();
                System.out.println("------------------");
            }
        }
    }

    public Student findTopStudent() {
        Student topStudents = null;
        for (Student student : students) {
            if (topStudents == null || student.getGpa() > topStudents.getGpa()) {
                topStudents = student;
            }
        }
        return topStudents;
    }

    public void displaySchoolarshipStudents() {
        boolean found = false;
        System.out.println("The list of students with schoolarship: ");
        for (Student student : students) {
            if (student.isSchoolarship()) {
                found = true;
                student.displayInfo();
                System.out.println("---------------------");
            }
        }
        if (!found) {
            System.out.println("No students with schoolarship found.");
        }
    }

    public double calculateTuiitionOfAllStudents() {
        double totalTuiition = 0;
        for (Student student : students) {
            totalTuiition += student.getTuiition();
        }
        return totalTuiition;
    }
}
