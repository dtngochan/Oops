package oops_exercises5;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        StudentList studentList = new StudentList();
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("===MENU===");
            System.out.println("1. Add a new student");
            System.out.println("2. Delete student by id");
            System.out.println("3. Find student by id");
            System.out.println("4. Display all students");
            System.out.println("5. Find students with the highest GPA");
            System.out.println("6. Display list of students with schoolarship");
            System.out.println("7. Display total tuiition fee of all students");
            System.out.println("0. Exit");
            System.out.println("Enter your choose: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch(choose){
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.deleteStudentById();
                    break;
                case 3:
                    studentList.findStudentByID();
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    Student topStudents = studentList.findTopStudent();
                    if(topStudents != null){
                        System.out.println("Student with the highest GPA: ");
                        topStudents.displayInfo();
                    }else{
                        System.out.println("Not found student");
                    }
                    break;
                case 6:
                    studentList.displaySchoolarshipStudents();
                    break;
                case 7:
                    double totalTuiition = studentList.calculateTuiitionOfAllStudents();
                    System.out.println("Total tuiition fee of all students: " +totalTuiition);
                    break;
                case 0:
                    System.out.println("Exiting program...........");
                    break;
                default:
                    System.out.println("Invalid choose. Try again.");
                
            }
        }while(choose != 0);
    }

}
