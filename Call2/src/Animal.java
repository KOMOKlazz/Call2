public abstract class Animal {
    public String animal;
    private String name;
    private String color;


    public Animal(String animal, String name, String color) {
        this.animal = animal;
        this.name = name;
        this.color = color;
    }

    public void GetInfo() {
        System.out.println();
        System.out.println("Информация");
        System.out.println("Животное: " + this.animal);
        System.out.println("Имя: " + this.name);
        System.out.println("Цвет: " + this.color);
        System.out.println();
    }

    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
