public class Fish extends Animal implements Feedable, Swimmable{
    private boolean isSwimming;

    public Fish(String name, String color) {
        super("Рыба", name, color);
    }

    @Override
    public void StartSwim() {
        if (isSwimming) {
            System.out.println("Рыбка уже плывет");
        }
        else {
            isSwimming = true;
            System.out.println("Рыбка начала плыть");
        }
    }

    @Override
    public void StopSwim() {
        if (!isSwimming) {
            System.out.println("Рыбка и так не плывет");
        }
        else {
            isSwimming = false;
            System.out.println("Рыбка остановилась");
        }
    }

    @Override
    public void Eat(Human human, String food) {
        System.out.println(this.getAnimal()+ " " + this.getName() + " была покормлена " + human.getName());
    }
}
















