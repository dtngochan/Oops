package oops_exercises4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {

    }

    public Student(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, float gpa, String major) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
                System.out.println("Enter Gpa: ");
                while (true) {
                    gpa = sc.nextFloat();
                    if (gpa >= 0.0 && gpa <= 4.0) {
                        setGpa(gpa);
                        break;
                    } else {
                        System.out.println("Please enter gpa between 0.0 and 4.0");
                    }
                }

                sc.nextLine();
                System.out.println("Enter major: ");
                major = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid format. Try again.");
                sc.nextLine();
            }
        }
    }

    @Override
    public void updatePerson(String id) {
        if (this.getId().equals(id)) {
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
                    System.out.println("Enter new Gpa: ");
                    while (true) {
                        gpa = sc.nextFloat();
                        if (gpa >= 0.0 && gpa <= 4.0) {
                            setGpa(gpa);
                            break;
                        } else {
                            System.out.println("Please enter gpa between 0.0 and 4.0");
                        }
                    }

                    sc.nextLine();
                    System.out.println("Enter new major: ");
                    major = sc.nextLine();
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
                + "\nGpa: " + gpa
                + "\nMajor: " + major);
    }

}
