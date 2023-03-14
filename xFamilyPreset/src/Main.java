public class Main {
    public static void main(String[] args) {
        Person roma = new Person("Рома");
        Person vasya = new Person("Вася");
        Person igor = new Person("Игорь");

        // System.out.println(roma);
        // System.out.println(vasya);
        // System.out.println(igor);

        roma.appendToFamily(igor);
        roma.appendToFamily(vasya);

        view(roma);
    }

    public static void view(Person rootPerson) {
        System.out.println(rootPerson);
        for (Person person : rootPerson.getFamily()) {
            view(person);
        }
    }
}
