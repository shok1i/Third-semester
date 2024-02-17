package Work_24;
import java.util.Arrays;
class RestaurantOrder {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private Item[] items;
    private double cost;
    private String name;

    // Конструктор
    public RestaurantOrder(String name) {
        this.name = name;
        this.size = 0;
        this.items = new Item[DEFAULT_SIZE];
        this.cost = 0;
    }

    // Методы
    public boolean addItem(Item item) {
        if (size < items.length) {
            items[size++] = item;
            cost += item.getCost();
            return true;
        }
        return false;
    }

    public boolean remove(String itemName) {
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].getName().equals(itemName)) {
                cost -= items[i].getCost();
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                items[--size] = null;
                return true;
            }
        }
        return false;
    }

    public int removeAll(String itemName) {
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].getName().equals(itemName)) {
                cost -= items[i].getCost();
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                items[--size] = null;
                count++;
            }
        }
        return count;
    }

    public int itemQuantity(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    public Item[] getItems() {
        return Arrays.copyOf(items, size);
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}