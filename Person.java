// TODO: Review feedback changes
package person;
import java.util.*;
import java.text.*;

public abstract class Person implements IPerson{
    private String id;
    private String name;
    private Date dateOfBirth;

    public Person(String id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void enterPersonInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = scanner.nextLine();
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        dateOfBirth = null;
        while(dateOfBirth == null){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter date of birth: ");
            String dateOfBirthString = scanner.nextLine();
            try{
                dateOfBirth = dateFormat.parse(dateOfBirthString);
            }catch(Exception e){
                System.out.println("Invalida date of birth, please enter date of birth again!");
            }
        }
    }
    
    public void updatePersonById(String id){
        System.out.println("Updating person with ID " + id+ ": ");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter new name: ");
        name = scanner.nextLine();
        this.setName(name);
        System.out.print("Enter new date of birth: ");
        String dateOfBirthString = scanner.nextLine();
        try{
            dateOfBirth = dateFormat.parse(dateOfBirthString);
        }catch(Exception e){
            System.out.println("Invalida date of birth, please enter date of birth again!");
        }
    }
    
    public void displayDetails(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + dateOfBirth);
    }
    
    public double calculateIncome(){
        return 0;
    }

   
    
}
