
package oops_exercises4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person{
    private String departmant;
    private String teachingSubject;
    public Teacher(){
        
    }
    public Teacher(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.departmant = department;
        this.teachingSubject = teachingSubject;
    }
    public String getDepartment(){
        return departmant;
    }
    public void setDepartment(String department){
        this.departmant = department;
    }
    public String getTeachingSubject(){
        return teachingSubject;
    }
    public void setTeachingSubject(String teachingSubject){
        this.teachingSubject = teachingSubject;
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void addPerson() {
        while (true) {
            try {

                System.out.println("Enter id: ");
                String id = sc.nextLine();
                setId(id);
                System.out.println("Enter full name: ");
                String fullName = sc.nextLine();
                setFullName(fullName);
                System.out.println("Enter date of birth(dd/MM/yyyy): ");
                String dob = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                setDateOfBirth(sdf.parse(dob));
                System.out.println("Enter book borrow date(dd/MM/yyyy): ");
                String dateBorrowDate = sc.nextLine();
                setBookBorrowDate(sdf.parse(dateBorrowDate));
                System.out.println("Enter book return date(dd/MM/yyyy): ");
                String bookReturnDate = sc.nextLine();
                setBookReturnDate(sdf.parse(bookReturnDate));
                System.out.println("Enter department: ");
                departmant = sc.nextLine();
                System.out.println("Enter teaching subject: ");
                teachingSubject = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid format. Try again.");
                sc.nextLine();
            }
        }
    }

    @Override
    public void updatePerson(String id) {
        if(this.getId().equals(id)){
            while (true) {
            try {
                System.out.println("Enter new full name: ");
                String fullName = sc.nextLine();
                setFullName(fullName);
                System.out.println("Enter new date of birth(dd/MM/yyyy): ");
                String dob = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                setDateOfBirth(sdf.parse(dob));
                System.out.println("Enter new book borrow date(dd/MM/yyyy): ");
                String dateBorrowDate = sc.nextLine();
                setBookBorrowDate(sdf.parse(dateBorrowDate));
                System.out.println("Enter new book return date(dd/MM/yyyy): ");
                String bookReturnDate = sc.nextLine();
                setBookReturnDate(sdf.parse(bookReturnDate));
                System.out.println("Enter new department: ");
                departmant = sc.nextLine();
                System.out.println("Enter new teaching subject: ");
                teachingSubject = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid format. Try again.");
                sc.nextLine();
            }
        }
        }
    }

    @Override
    public void displayPerson() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + getId()
                + "\nFull name: " + getFullName()
                + "\nDate of birth: " + sdf.format(getDateOfBirth())
                + "\nBook borrow date: " + sdf.format(getBookBorrowDate())
                + "\nBook return date: " + sdf.format(getBookReturnDate())
                + "\nDepartment: " + departmant
                + "\nTeaching subject: " + teachingSubject);
    }
    
}
