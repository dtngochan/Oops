
package oops_exercises4;

import java.util.Date;

public abstract class Person implements IPerson{
    private String id;
    private String fullName;
    private Date dateOfBirth;
    private Date bookBorrowDate;
    private Date bookReturnDate;
    public Person(){
        
    }
    public Person(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate){
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public Date getBookBorrowDate(){
        return bookBorrowDate;
    }
    public void setBookBorrowDate(Date bookBorrowDate){
        this.bookBorrowDate = bookBorrowDate;
    }
    public Date getBookReturnDate(){
        return bookReturnDate;
    }
    public void setBookReturnDate(Date bookReturnDate){
        this.bookReturnDate = bookReturnDate;
    }
    @Override
    public abstract void addPerson();
    @Override
    public abstract void updatePerson(String id);
    @Override
    public abstract void displayPerson();
    public boolean isBookOverdue(){
        if(bookBorrowDate == null || bookReturnDate == null){
            return false;
        }
        long difference = bookReturnDate.getTime() - bookBorrowDate.getTime();
        long days = difference / (1000*60%60%24);
        return days>=30;
    }
    
}
