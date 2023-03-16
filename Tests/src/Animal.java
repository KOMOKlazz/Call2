public abstract class Animal {
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract void Voice();
}
