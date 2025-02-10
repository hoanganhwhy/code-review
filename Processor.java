
package person;
import java.util.*;

public class Processor {
    public static void main(String args[]){
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("=== MENU ===");
            System.out.println("1. Add new Student");
            System.out.println("2. Add new Teacher");
            System.out.println("3. Update person with id");
            System.out.println("4. Delete person with id");
            System.out.println("5. Find person with id");
            System.out.println("6. Display all person");
            System.out.println("7. Find top 3 students with the highest GPA");
            System.out.println("8. Find the teacher with highest income");
            System.out.println("9. Find student with scholarship");
            System.out.println("10. Exit program");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    Student student = new Student();
                    student.enterPersonInfo();
                    personList.addPerson(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    teacher.enterPersonInfo();
                    personList.addPerson(teacher);
                    break;
                case 3:
                    System.out.println("Enter id want to update: ");
                    String idToUpdate = scanner.nextLine();
                    personList.updatePersonById(idToUpdate);
                    if(personList.updatePersonById(idToUpdate) == true){
                        System.out.println("Updating person complete");
                    }else{
                        System.out.println("ID not found");
                    }
                    break;
                case 4: 
                    System.out.println("Enter id want to delete: ");
                    String idToDelete = scanner.nextLine();
                    personList.updatePersonById(idToDelete);
                    if(personList.updatePersonById(idToDelete) == true){
                        System.out.println("Deleting person complete");
                    }else{
                        System.out.println("ID not found");
                    }
                    break;
                case 5: 
                    System.out.println("Enter id want to find: ");
                    String idToFind = scanner.nextLine();
                    if(personList.findPersonById(idToFind) != null){
                        personList.findPersonById(idToFind).displayDetails();
                    }else{
                        System.out.println("Id not found");
                    }
                    break;
                case 6:
                    personList.displayAll();
                    break;
                case 7:
                    if(personList.findTop3Students()!= null){
                        personList.findTop3Students().displayDetails();
                    }else{
                        System.out.println("Dont have top 3 students");
                    }
                    break;
                case 8:
                    if(personList.findTeacherWithHighestIncome() != null){
                        personList.findTeacherWithHighestIncome().displayDetails();
                    }else{
                        System.out.println("Dont have teacher with highest income");
                    }
                    break;
                case 9:
                    List<Student> scholarshipStudent = personList.findStudentsWithScholarships();
                    scholarshipStudent.forEach(Student::displayDetails);
                    break;
                case 10:
                    System.out.println("Exit program !");
                    break;
                default:
                    System.out.println("Invalida choice, please enter choice again");
            }
        }
    }
}
