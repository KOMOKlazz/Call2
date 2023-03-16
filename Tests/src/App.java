public class App {
    public static void main(String[] args) throws Exception {
        Tiger tiger = new Tiger("Василий");
        System.out.println(tiger.getName());
        tiger.Voice();
        tiger.Swim();
        tiger.Eat();
    }
}
