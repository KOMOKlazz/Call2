public class App {
    public static void main(String[] args) throws Exception {
        Human oleg = new Human("Олег");
        Cat cat = new Cat("Барсик");
        Cat cat2 = new Cat("Бублик");

        oleg.Call(cat);
        oleg.Call(cat2);
    }
}
