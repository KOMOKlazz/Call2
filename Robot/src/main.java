public class main {
    public static void main(String[] args) {
        Robot1 robot1 = new Robot1("name_1", 1);

        System.out.printf("%s %d\n", robot1.name, robot1.level);
        robot1.powerOn();
    }
}
