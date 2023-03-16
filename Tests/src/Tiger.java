public class Tiger extends Animal implements Swimmable, Eatable{

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void Voice() {
        System.out.println(this.getName() + " рычит: рррр");
    }

    @Override
    public void Swim() {
        System.out.println(this.getName() + " плавает");
    }

    @Override
    public void Eat() {
        System.out.println(this.getName() + " съел кита");
    }
}
