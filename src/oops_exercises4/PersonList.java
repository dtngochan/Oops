package oops_exercises4;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    private ArrayList<Person> people = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addPerson(Person person) {
        people.add(person);
        System.out.println("Person added successfully.");
    }

    public void displayAll() {
        if (people.isEmpty()) {
            System.out.println("No people in list");
            
        } else {
            for (Person person : people) {
                person.displayPerson();
                System.out.println("---------------");
            }
        }
    }

    public void updatePerson() {

        System.out.println("Enter id of person want to update");
        String idToUpdate = sc.nextLine();
        for (Person person : people) {
            if (person.getId().equals(idToUpdate)) {
                person.updatePerson(idToUpdate);
                System.out.println("Person updated successfully");
                return;
            }
        }
        System.out.println("Not found person");
    }

    public void deletePerson() {
        System.out.println("Enter id of person want to delete");
        String idToDelete = sc.nextLine();
        for(Person person:people){
            if(person.getId().equals(idToDelete)){
                people.remove(person);
                System.out.println("Person deleted successfullt");
                return;
            }
        }
        System.out.println("Not found person");
    }
    public Student findTopStudent(){
        Student topStudent = null;
        for(Person person:people){
            if(person instanceof Student){
                Student student = (Student) person;
                if(topStudent == null || student.getGpa() > topStudent.getGpa()){
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }
    public ArrayList<Teacher> findTeachersByDepartment(String department){
        ArrayList<Teacher> teachers = new ArrayList<>();
        for(Person person:people){
            if(person instanceof Teacher){
                Teacher teacher = (Teacher) person;
                if(teacher.getDepartment().equals(department)){
                    teachers.add(teacher);
                }
            }
        }
        return teachers;
    }
    public void checkBookBorrowing(){
        if(people.isEmpty()){
            System.out.println("No people in list");
            return;
        }
        for(Person person:people){
            System.out.println("Checking books status for: " +person.getFullName());
            if(person.isBookOverdue()){
                System.out.println("Overdue");
            }else{
                System.out.println("No overdue");
            }
        }
        
    }
}
