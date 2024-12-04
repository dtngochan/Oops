package oops_exercises4;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===MENU===");
            System.out.println("1. Add new Student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all person");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Check book borrowing status");
            System.out.println("0. Exit");
            System.out.println("Enter your choose: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.addPerson();
                    personList.addPerson(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    teacher.addPerson();
                    personList.addPerson(teacher);
                    break;
                case 3:
                    personList.updatePerson();
                    break;
                case 4:
                    personList.deletePerson();
                    break;
                case 5:
                    System.out.println("All students and teachers: ");
                    personList.displayAll();
                    break;
                case 6:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top student: ");
                        topStudent.displayPerson();
                    } else {
                        System.out.println("Not students found.");
                    }
                    break;
                case 7:
                    System.out.println("Enter department to search: ");
                    String department = sc.nextLine();
                    
                    var teachers = personList.findTeachersByDepartment(department);
                    if (teachers.isEmpty()) {
                        System.out.println("No teachers found in this department");
                    } else {
                        System.out.println("Teachers in department " + department + ": ");
                        ArrayList<Teacher> teacherss = new ArrayList<>();
                        for (Teacher teacherr : teacherss) {
                            teacherr.displayPerson();
                            System.out.println("-----------------");
                        }
                    }
                    break;
                case 8:
                    personList.checkBookBorrowing();
                    break;
                case 0:
                    System.out.println("Exiting program...........");
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        } while (choice != 0);
    }
}
