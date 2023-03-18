public class App {
    public static void main(String[] args) throws Exception {
        Human oleg = new Human("Олег");
        Cat cat = new Cat("Барсик", "Черный");
        Cat cat2 = new Cat("Бублик", "Белый");

        Fish fish = new Fish("Головорез", "Красно-белая");

        oleg.AddAnimal(cat);

        oleg.Call(cat);
        oleg.Call(cat2);
        System.out.println(cat.getColor());
        cat2.GetInfo();
        cat.GetInfo();

        fish.StopSwim();
        fish.StartSwim();
        fish.StopSwim();

        fish.GetInfo();
        oleg.Feed(fish, "Булочка");
    }
}
