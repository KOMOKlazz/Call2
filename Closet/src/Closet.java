import java.util.ArrayList;

public class Closet {
    public ArrayList<Item> closet = new ArrayList<>();
    public boolean isClosed = true;

    public Closet() {
        for (int i = 0; i < 5; i++) {
            closet.add(i, null);
        }
    }

    public ArrayList<Item> GetCloset() {
        return closet;
    }

    public void PutItemInCloset(Item item, int number) {
        if (isClosed == true) {
            System.out.println("Шкаф закрыт");
        } else if (closet.get(number) == null) {
            closet.set(number, item);
            System.out.println("Вы положили " + item.getName() + " в полку " + number);
        } else {
            System.out.println("Полка занята");
        }
    }

    public void GetItemInCloset(int number) {
        if (isClosed == true) {
            System.out.println("Шкаф закрыт");
        } else if (closet.get(number) != null) {
            System.out.println("Вы взяли " + closet.get(number).getName() + " из полки " + number);
            closet.set(number, null);
        } else {
            System.out.println("В полке ничего нет");
        }
    }

    public void OpenCloset() {
        isClosed = false;
    }

    public void CloseCloset() {
        isClosed = true;
    }
}