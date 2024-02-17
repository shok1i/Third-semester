package Work_21;

import java.util.NoSuchElementException;

public class ArrayQueue<T> {
    private T[] queue;
    private int size;
    private int front;
    private int rear;

    public ArrayQueue(int capacity) {
        queue = (T[]) new Object[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(T item) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }

    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue[front];
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T item = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < queue.length; i++) {
            queue[i] = null;
        }
        size = 0;
        front = 0;
        rear = -1;
    }
}