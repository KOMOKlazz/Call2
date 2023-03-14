import java.util.ArrayList;

public class Person {
    public String name;
    ArrayList<Person> family = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getFamily() {
        return family;
    }

    public void appendToFamily(Person person) {
        if (person != this && person != null) {
            family.add(person);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
