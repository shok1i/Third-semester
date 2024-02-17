package Work_21;

public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;

    // Предусловие: элемент не равен null
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;
        ensureCapacity(queue, queue.size + 1);
        queue.elements[(queue.head + queue.size) % queue.elements.length] = element;
        queue.size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент в очереди
    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0;
        return queue.elements[queue.head];
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент в очереди
    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0;
        Object element = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return element;
    }

    // Постусловие: возвращен текущий размер очереди
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Постусловие: вернут true, если очередь пуста, иначе false
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Постусловие: очередь очищена
    public static void clear(ArrayQueueADT queue) {
        queue.elements = new Object[10];
        queue.size = 0;
        queue.head = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            int newCapacity = Math.max(2 * queue.elements.length, capacity);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[(queue.head + i) % queue.elements.length];
            }
            queue.elements = newElements;
            queue.head = 0;
        }
    }
}


