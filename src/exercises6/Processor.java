package exercises6;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("===MENU===");
            System.out.println("1. Add a new student");
            System.out.println("2. Update student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Display all students");
            System.out.println("5. Find student by id");
            System.out.println("6. Find the students with the highest GPA");
            System.out.println("7. Display the list of students with scholarship");
            System.out.println("8. Display total tuition fee of all students");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.updateStudent();
                    break;
                case 3:
                    studentList.deleteStudentById();
                    break;
                case 4:
                    studentList.displayAllStudent();
                    break;
                case 5:
                    studentList.findStudentById();
                    break;
                case 6:
                    Student topStudent = studentList.findTopStudent();
                    if(topStudent != null){
                        System.out.println("Student with highest GPA: ");
                        topStudent.displayInfo();
                    }else{
                        System.out.println("Not found student");
                    }
                    break;
                case 7:
                    studentList.findScholarshipStudents();
                    break;
                case 8:
                    double totalTuition = studentList.calculateTuitionOfAllStudents();
                    System.out.println("Total tuition fee of all students: " +totalTuition);
                    break;
                case 0:
                    System.out.println("Exiting program...........");
                    break;
                default:
                    System.out.println("Invalid yout choice. Try again");
                
                
            }
        }while(choice != 0);
    }

}
