
package person;
import java.util.*;

public class PersonList {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public boolean deletePersonById(String id) {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public List<Student> findTop3Students() {
        List<Student> students = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Student) {
                students.add((Student) person);
            }
        }
        students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        return students.size() >= 3 ? students.subList(0, 3) : students;
    }
}
