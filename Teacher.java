
package person;
import java.util.*;

public class Teacher extends Person{
    private int numberOfClasses;
    private double baseSalary;

    public Teacher(int numberOfClasses, double baseSalary, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.numberOfClasses = numberOfClasses;
        this.baseSalary = baseSalary;
    }

    public Teacher() {
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    
    
    public void enterPersonInfo(){
        Scanner scanner = new Scanner(System.in);
        super.enterPersonInfo();
        System.out.print("Enter number of classes: ");
        numberOfClasses = scanner.nextInt();
        System.out.print("Enter base salary: ");
        baseSalary = scanner.nextDouble();
    }
    
    public void updatePersonById(String id){
        Scanner scanner = new Scanner(System.in);
        super.updatePersonById(id);
        System.out.print("Enter new number of classes: ");
        numberOfClasses = scanner.nextInt();
        this.setNumberOfClasses(numberOfClasses);
        System.out.print("Enter new base salary: ");
        baseSalary = scanner.nextDouble();
        this.setBaseSalary(baseSalary);
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Number of classes: " + numberOfClasses);
        System.out.println("Base salary: " + baseSalary);
    }
    
    public double calculateIncome(){
        return this.getNumberOfClasses() * this.getBaseSalary();
    }
}

