package exercises6;

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

    public void updateStudent() {
        System.out.println("Enter id to update: ");
        String idToUpdate = sc.nextLine();
        for (Student student : students) {
            if (student.getId().equals(idToUpdate)) {
                student.updateStudent();
                System.out.println("Student updated successfully");
                return;
            }
        }
        System.out.println("Not found student");
    }

    public void deleteStudentById() {
        System.out.println("Enter id to delete: ");
        String idToDelete = sc.nextLine();
        for (Student student : students) {
            if (student.getId().equals(idToDelete)) {
                students.remove(student);
                System.out.println("Deleted successfully");
                return;
            }
        }
        System.out.println("Not student student");
    }

    public void displayAllStudent() {
        if (students.isEmpty()) {
            System.out.println("No students in list");
        } else {
            for (Student student : students) {
                student.displayInfo();
                System.out.println("---------------------");
            }
        }
    }

    public void findStudentById() {
        System.out.println("Enter id to find: ");
        String idToFind = sc.nextLine();
        for (Student student : students) {
            if (student.getId().equals(idToFind)) {
                System.out.println("Student found: ");
                student.displayInfo();
                return;
            }
        }
        System.out.println("Not found student");
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (Student student : students) {
            if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    public void findScholarshipStudents() {
        for (Student student : students) {
            if (student.isScholarship()) {
                student.displayInfo();
                System.out.println("----------------");
                return;
            }
        }
        System.out.println("No students with scholarship in list");
    }

    public double calculateTuitionOfAllStudents() {
        double totalTuition = 0;
        for (Student student : students) {
            totalTuition += student.calculateTuition();
        }
        return totalTuition;
    }
}
