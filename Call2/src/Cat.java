public class Cat extends Animal implements Callable{

    public Cat(String name, String color) {
        super("Кот", name, color);
    }

    @Override
    public void Reply(Human human) {
        if(human.GetAnimals().contains(this)) {
            System.out.println("Кот " + this.getName() + " сказал: мяу");
        }
        else {
            System.out.println(human.getName() + " не является хозяином кота " + this.getName());
        }
    }
}
