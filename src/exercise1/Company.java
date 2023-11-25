package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> persons = new ArrayList<>();

    public void employ(Person person) {
        persons.add(person);
    }

    public Person getManager() {
        for (Person person : persons) {
            if (person.getPosition().equals("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPosition().equals(profession)) {
                result.add(person);
            }
        }
        System.out.println(result.get(0).getName());
        return result;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPerson(String name) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(name)) {
                result.add(person);
            }
        }
        System.out.println(result);
        return result;
    }
}
