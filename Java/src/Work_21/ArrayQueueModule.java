package Work_21;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int head = 0;

    // Предусловие: элемент не равен null
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент в очереди
    public static Object element() {
        assert size > 0;
        return elements[head];
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент в очереди
    public static Object dequeue() {
        assert size > 0;
        Object element = elements[head];
        elements[head] = null; // Освобождаем ссылку для GC
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    // Постусловие: возвращен текущий размер очереди
    public static int size() {
        return size;
    }

    // Постусловие: вернут true, если очередь пуста, иначе false
    public static boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена
    public static void clear() {
        elements = new Object[10];
        size = 0;
        head = 0;
    }

    // Увеличивает внутренний массив, если необходимо
    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newCapacity = Math.max(2 * elements.length, capacity);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
        }
    }
}