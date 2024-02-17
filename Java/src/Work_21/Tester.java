package Work_21;

public class Tester {
    public static void main(String[] args) {
        TesterAQ taq = new TesterAQ();
        taq.test();
        ArrayQueueModuleTester armt = new ArrayQueueModuleTester();
        armt.test();
        ArrayQueueADTTest aqadt = new ArrayQueueADTTest();
        aqadt.test();
    }
}
class TesterAQ {
    public void test(){
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
        // Добавляем элементы в очередь
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        // Выводим первый элемент в очереди
        System.out.println(queue.element()); // Вывод: 1
        // Удаляем и выводим первый элемент в очереди
        System.out.println(queue.dequeue()); // Вывод: 1
        // Выводим текущий размер очереди
        System.out.println(queue.size()); // Вывод: 2
        // Проверяем, является ли очередь пустой
        System.out.println(queue.isEmpty()); // Вывод: false
        // Удаляем все элементы из очереди
        queue.clear();
        // Проверяем, является ли очередь пустой после очистки
        System.out.println(queue.isEmpty()); // Вывод: true
    }
}

class ArrayQueueModuleTester {
    public void test(){
        // Тестирование методов класса ArrayQueueModule

        // Создание очереди
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);

        // Вывод первого элемента в очереди
        System.out.println(ArrayQueueModule.element()); // Вывод: 1

        // Удаление и вывод первого элемента в очереди
        System.out.println(ArrayQueueModule.dequeue()); // Вывод: 1

        // Вывод текущего размера очереди
        System.out.println(ArrayQueueModule.size()); // Вывод: 2

        // Проверка, является ли очередь пустой
        System.out.println(ArrayQueueModule.isEmpty()); // Вывод: false

        // Очистка очереди
        ArrayQueueModule.clear();

        // Проверка, является ли очередь пустой после очистки
        System.out.println(ArrayQueueModule.isEmpty()); // Вывод: true
    }
}

class ArrayQueueADTTest {
    public void test() {
        ArrayQueueADT queue = new ArrayQueueADT();
        // Тестирование методов enqueue и size
        for (int i = 1; i <= 5; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
        System.out.println("Размер очереди: " + ArrayQueueADT.size(queue)); // Ожидаемый результат: 5
        // Тестирование метода element
        System.out.println("Первый элемент: " + ArrayQueueADT.element(queue)); // Ожидаемый результат: 1
        // Тестирование методов dequeue и isEmpty
        while (!ArrayQueueADT.isEmpty(queue)) {
            System.out.println("Удален элемент: " + ArrayQueueADT.dequeue(queue));
        }
        System.out.println("Размер очереди: " + ArrayQueueADT.size(queue)); // Ожидаемый результат: 0
        // Тестирование метода clear
        ArrayQueueADT.enqueue(queue, "A");
        ArrayQueueADT.enqueue(queue, "B");
        ArrayQueueADT.enqueue(queue, "C");
        System.out.println("Размер очереди перед очисткой: " + ArrayQueueADT.size(queue)); // Ожидаемый результат: 3
        ArrayQueueADT.clear(queue);
        System.out.println("Размер очереди после очистки: " + ArrayQueueADT.size(queue)); // Ожидаемый результат: 0
    }
}