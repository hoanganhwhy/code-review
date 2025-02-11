package person;
import java.util.*;

public class Processor {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 10) {
            System.out.println("=== MENU ===");
            System.out.println("1. Add new Student");
            System.out.println("2. Add new Teacher");
            System.out.println("3. Update person with id");
            System.out.println("4. Delete person with id");
            System.out.println("5. Find person with id");
            System.out.println("6. Display all person");
            System.out.println("7. Find top 3 students with the highest GPA");
            System.out.println("8. Exit program");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
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
                    System.out.print("Enter id to update: ");
                    String idToUpdate = scanner.nextLine();
                    Person personToUpdate = personList.findPersonById(idToUpdate);
                    if (personToUpdate != null) {
                        personToUpdate.updatePersonById(idToUpdate);
                        System.out.println("Update completed.");
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter id to delete: ");
                    String idToDelete = scanner.nextLine();
                    if (personList.deletePersonById(idToDelete)) {
                        System.out.println("Delete completed.");
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter id to find: ");
                    String idToFind = scanner.nextLine();
                    Person person = personList.findPersonById(idToFind);
                    if (person != null) {
                        person.displayDetails();
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;
                case 6:
                    for (Person p : personList.findTop3Students()) {
                        p.displayDetails();
                    }
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}

                    
