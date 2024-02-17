package Work_23;

public class InternetOrder {
    private Node head;
    private int size;

    public InternetOrder() {
        head = new Node(null);
        head.next = head;
        head.prev = head;
        size = 0;
    }

    public InternetOrder(Item[] items) {
        this();
        for (Item item : items) {
            add(item);
        }
    }

    public boolean add(Item item) {
        Node newNode = new Node(item);
        newNode.prev = head.prev;
        newNode.next = head;
        head.prev.next = newNode;
        head.prev = newNode;
        size++;
        return true;
    }

    public boolean remove(String itemName) {
        Node current = head.next;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int removeAll(String itemName) {
        int count = 0;
        Node current = head.next;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                count++;
                size--;
            }
            current = current.next;
        }
        return count;
    }

    public int getOrderSize() {
        return size;
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        Node current = head.next;
        int index = 0;
        while (current != head) {
            items[index] = current.item;
            current = current.next;
            index++;
        }
        return items;
    }

    public double getTotalCost() {
        double totalCost = 0;
        Node current = head.next;
        while (current != head) {
            totalCost += current.item.getCost();
            current = current.next;
        }
        return totalCost;
    }

    public int getItemCount(String itemName) {
        int count = 0;
        Node current = head.next;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public String[] getItemNames() {
        Node current = head.next;
        String[] result = new String[size];
        int i = 0;
        while(current != head){
            result[i] = current.item.getName();
            current = current.next;
            i++;
        }
        return result;
    }

    public Item[] getSortedItemsByPrice() {
        Item[] items = getItems();
        Item[] new_items = new Item[size];
        boolean checker = false;
        int g = 0;
        while(true){
            int del = 0;
            Item max = new Dish("asd","asd",0);
            checker = false;
            for(int i = 0; i < size; i++){
                if(max.getCost() < items[i].getCost()){
                    max = items[i];
                    del = i;
                    checker = true;
                }
            }
            new_items[g] = max;
            g++;
            items[del] = null;
            if(!checker){
                break;
            }
        }
        return new_items;
    }

    private class Node {
        private Item item;
        private Node prev;
        private Node next;

        public Node(Item item) {
            this.item = item;
        }
    }
}