public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void reply() {
        System.out.println("Кот " + this.name + " сказал - мяу");
    }
}
