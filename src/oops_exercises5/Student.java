package oops_exercises5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;
    private double tuiition;
    private boolean schoolarship;
 
    public Student() {
        
    }

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
        calculateTuiition();
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
        calculateTuiition();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
        
    }

    public double getTuiition() {
        return tuiition;
    }

    public boolean isSchoolarship() {
        return schoolarship;
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
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
                setDateOfBirth(sdf.parse(dob));
                System.out.println("Enter gpa: ");
                gpa = sc.nextFloat();
                calculateTuiition();
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

    private void calculateTuiition() {
        
        if (gpa >= 9.0) {
            schoolarship = true;
            tuiition = 10000000 * 0.5;
        } else {
            tuiition = 10000000;
            schoolarship = false;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Id: " + getId()
                + "\nFull name: " + getFullName()
                + "\nDate of birth: " + sdf.format(getDateOfBirth())
                + "\nGPA: " + gpa
                + "\nMajor: " + major
                + "\nTuiition: " + tuiition
                + "\nSchoolarship: " + (schoolarship ? "Yes" : "No"));
    }

}
