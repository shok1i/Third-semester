package Work_23;

public class Order {
    private Item[] items;
    private int count;

    public Order(int maxSize) {
        items = new Item[maxSize];
        count = 0;
    }

    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("На один стол больше заказывать нельзя.");
        }
    }

    public void removeItem(Item item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                items[i] = null;
                for (int j = i; j < count - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Не удалось найти предмет в заказе.");
    }

    public Item[] getItems() {
        return items;
    }
}