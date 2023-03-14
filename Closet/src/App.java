public class App {
    public static void main(String[] args) {
        Closet closet = new Closet();
        Item item = new Item("Карандаш");
        Item item2 = new Item("Лампа");

        closet.PutItemInCloset(item, 1);
        closet.OpenCloset();
        closet.PutItemInCloset(item, 1);
        closet.PutItemInCloset(item2, 4);
        closet.GetItemInCloset(1);
    }
}
