package Work_23;

import java.util.HashMap;

public class TablesOrderManager {
    private final HashMap<Integer, Order> orders;

    public TablesOrderManager() {
        orders = new HashMap<>();
    }

    public void addOrder(int tableNumber, Order order) {
        orders.put(tableNumber, order);
    }

    public void removeOrder(int tableNumber) {
        orders.remove(tableNumber);
    }

    public Order getOrder(int tableNumber) {
        return orders.get(tableNumber);
    }
}