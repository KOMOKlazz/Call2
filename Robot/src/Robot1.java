import java.util.ArrayList;

public class Robot1 {
    public int level;
    public String name;

    private State state;

    enum State {
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    public Robot1(String name, int level) {
        if ((name.isEmpty()
                || Character.isDigit(name.charAt(0)))
                || Robot1.names.indexOf(name) == -1)
        {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Robot1.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    public Robot1(String name) {
        this(name, 1);
    }

    public Robot1() {
        this("");
    }

    public void getName(String name) {
        this.name = name;
    }

    public void getLevel(int level) {
        this.level = level;
    }

    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    void startBIOS() { System.out.println("START BIOS..."); }
    void startOS() { System.out.println("START OS..."); }
    void sayHi() { System.out.println("HI..."); }
}