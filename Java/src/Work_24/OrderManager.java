package Work_24;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Переименованный класс OrderManager
class OrderManager {
    private Map<String, Order> addressOrderMap;

    // Конструктор
    public OrderManager() {
        this.addressOrderMap = new HashMap<>();
    }

    // Перегруженные методы для работы с адресами заказов
    public void addOrder(String address, Order order) {
        addressOrderMap.put(address, order);
    }

    public Order getOrder(String address) {
        return addressOrderMap.get(address);
    }

    public void removeOrder(String address) {
        addressOrderMap.remove(address);
    }

    // Перегруженные методы для добавления позиции к заказу
    public void addPosition(String address, Item item) {
        Order order = addressOrderMap.get(address);
        if (order != null) {
            order.addPosition(item);
        }
    }

    // Методы для работы с интернет-заказами
    public List<Order> getAllInternetOrders() {
        List<Order> orders = new ArrayList<Order>();
        for(String str : addressOrderMap.keySet()){
            if(str.startsWith("Адрес")){
                orders.add(addressOrderMap.get(str));
            }
        }
        return orders;
        //return addressOrderMap.values().toArray(new Order[0]);
    }

    public double getTotalInternetOrdersCost() {
        double totalCost = 0;
        for (String str : addressOrderMap.keySet()) {
            if(str.charAt(0) == 'A'){
                totalCost += addressOrderMap.get(str).getTotalCost();
            }
        }
        return totalCost;
    }

    public int getTotalOrderedDishesCount(String itemName) {
        int totalCount = 0;
        for (Order order : addressOrderMap.values()) {
            if (order != null) {
                totalCount += order.getItemsCount(itemName);
            }
        }
        return totalCount;
    }
}