public class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public void Call(Cat cat) {
        cat.reply();
    }
}
