
package person;
import java.util.*;

public class Student extends Person{
    private double gpa;
    private double tuitionFee;

    public Student(double gpa, double tuitionFee, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }

    public Student() {
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
    
    public void enterPersonInfo(){
        Scanner scanner = new Scanner(System.in);
        super.enterPersonInfo();
        System.out.print("Enter gpa: ");
        gpa = scanner.nextDouble();
        System.out.print("Enter tuitionFee: ");
        tuitionFee = scanner.nextDouble();
    }
    
    public void updatePersonById(String id){
        Scanner scanner = new Scanner(System.in);
        super.updatePersonById(id);
        System.out.print("Enter new gpa: ");
        gpa = scanner.nextDouble();
        this.setGpa(gpa);
        System.out.print("Enter new tuitionFee: ");
        tuitionFee = scanner.nextDouble();
        this.setTuitionFee(tuitionFee);
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Gpa: " + gpa);
        System.out.println("TuitionFee: " + tuitionFee);
    }
    
    public double calculateIncome(){
        return gpa > 3.5 ? tuitionFee * 0.5 : tuitionFee;
    }
}
