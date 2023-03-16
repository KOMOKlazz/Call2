import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", Sex.woman);
        Person vasya = new Person("Вася", Sex.man);
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, jane);

        ArrayList<String> l = new Reserch(gt).spend(irina,
                Relationship.parent);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(irina + " Родитель ==> " + l.get(i));
        }

        l = new Reserch(gt).spend(vasya,
                Relationship.parent);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(vasya + " Родитель ==> " + l.get(i));
        }

        System.out.println(jane.toString());
    }
}
