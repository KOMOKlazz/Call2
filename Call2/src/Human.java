import java.util.ArrayList;

public class Human {
    private String name;
    private ArrayList<Animal> animals = new ArrayList<>();

    public Human(String name) {
        this.name = name;
    }

    public void Call(Cat cat) {
        cat.Reply(this);
    }

    public void Feed(Fish fish, String food) {
        fish.Eat(this, food);
    }

    public String getName() {
        return name;
    }

    public void AddAnimal(Animal animal) {
        animals.add(animal);
    }

    public void RemoveAnimal(Animal animal) {
        animals.remove(animal);
    }

    public ArrayList<Animal> GetAnimals() {
        return animals;
    }
}












