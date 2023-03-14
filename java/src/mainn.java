public class mainn {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Тихон";
        w1.lastName = "Добрусов";
        w1.id = 1;
        w1.hobby = "Программирование";

        Worker w2 = new Worker();
        w2.firstName = "Роман";
        w2.lastName = "Мицкович";
        w2.id = 3;
        w2.hobby = "Футбол";

        Worker w3 = new Worker();
        w3.firstName = "Тихон";
        w3.lastName = "Добрусов";
        w3.id = 1;
        w3.hobby = "Программирование";

        var array = new int[]{1,-10,4,8,-22};
        System.out.println(array);
    }
}
