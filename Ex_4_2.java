// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Ex_4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println("Исходная цепочка чисел: " + list);
        int element = 777;
        enqueue(list, element);
        System.out.println("Первый элемент целпочки: " + dequeue(list));
        System.out.println("Цепочка без первого элемента: " + list);
        System.out.println("Первый элемент из цепочки: " + first(list));
        System.out.println("Исходная очередь: " + list);

    }
    public static void enqueue(LinkedList<Integer> list, int element) {
        list.addLast(element);
        System.out.println("Добавили элемент в конец цепочки чисел: " + list);
    }
    public static int dequeue(LinkedList<Integer> list) {
        int result = list.getFirst();
        list.removeFirst();
        return result;
        
    }
    public static int first(LinkedList<Integer> list) {
        int result = list.getFirst();
        return result;
    }
}
