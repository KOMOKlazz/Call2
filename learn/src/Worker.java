public class Worker {
    String firstName;
    String lastName;
    public static int id;
    String hobby;

    public int x, y;

    public Worker(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public int getX() {
        return x;
    }

    public static void calc(int value) {
        id = value;
    }

    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }
}