/* Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;
import java.util.Deque;

public class task2 {
    public static void main(String[] args) {
        Deque<Object> line = new LinkedList<>();
        task2 myLine2 = new task2();
        line.push("T");
        line.push("a");
        line.push("e");
        line.push("r");
        line.push("G");
        line.push("!");
        line.push("?");
        line.push("!");
        System.out.printf("Текущая очередь: %s\n", line);
        myLine2.enqueue(line);
        System.out.printf("Очередь после перемещения первого элемента: %s \n", line);
        myLine2.dequeue(line);
        System.out.printf("Очередь после удаления первого элемента: %s \n", line);
        myLine2.first(line);
        System.out.printf("Очередь после возвращения 1 элемента(без его удаления): %s \n", line);
    }
    public void first(Deque<Object> object){
        System.out.println("Первый элемент очереди: " + object.getFirst());
    }

    private void enqueue(Deque<Object> object){
        object.addLast(object.pollFirst());

    }
    private void dequeue(Deque<Object> object){
        System.out.println("Удаляем первый элемент очереди: " + object.removeFirst());
    }
    
}
