
package exercises6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Student extends Person{
    private float gpa;
    private String major;
    private double tuition;
    private boolean scholarship;
    final double base_tuition = 10000000;
    public Student(){
        
    }
    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major){
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
        calculateTuition();
    }
    public float getGpa(){
        return gpa;
    }
    public void setGpa(float gpa){
        this.gpa = gpa;
        calculateTuition();
    }
    public String getMajor(){
        return major;
        
    }
    public void setMajor(String major){
        this.major = major;
    }
    public double getTuition(){
        return tuition;
    }
    public boolean isScholarship(){
        return scholarship;
        
    }
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public void addStudent(){
        while(true){
            try{
                System.out.println("Enter id: ");
                String id = sc.nextLine();
                setId(id);
                
                System.out.println("Enter full name: ");
                String name = sc.nextLine();
                setFullName(name);
                
                System.out.println("Enter date of birth: ");
                String dob = sc.nextLine();
                setDateOfBirth(sdf.parse(dob));
                
                System.out.println("Enter gpa: ");
                gpa = sc.nextFloat();
                calculateTuition();
                
                sc.nextLine();
                System.out.println("Enter major: ");
                major = sc.nextLine();
                break;
                
            }catch(Exception e){
                System.out.println("Invalid format. Try again");
                sc.nextLine();
            }
        }
    }
    public double calculateTuition(){
        if(gpa >= 9.0){
            scholarship = true;
            tuition = base_tuition * 0.5;
        }else{
            scholarship = false;
            tuition = base_tuition;
        }
        return tuition;
    }
    public void updateStudent(){
        while(true){
            try{               
                System.out.println("Enter new full name: ");
                String name = sc.nextLine();
                setFullName(name);
                
                System.out.println("Enter new date of birth: ");
                String dob = sc.nextLine();
                setDateOfBirth(sdf.parse(dob));
                
                System.out.println("Enter new goa: ");
                gpa = sc.nextFloat();
                calculateTuition();
                
                sc.nextLine();
                System.out.println("Enter new major: ");
                major = sc.nextLine();
                break;
                
            }catch(Exception e){
                System.out.println("Invalid format. Try again");
                sc.nextLine();
            }
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("ID: " +getId() +
                "\nFull name: " +getFullName() +
                "\nDate of bith: " +sdf.format(getDateOfBirth()) +
                "\nGPA: " +gpa +
                "\nMajor: " +major +
                "\nTuition: " +tuition +
                "\nScholarshio: " +(scholarship ? "Yes" :"No"));
    }
    
}
