// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список

import java.util.LinkedList;
import java.util.Random;


public class Ex_4_1 {
    public static void main(String[] args) {
        Random random = new Random(1);
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1, 20));
            
        }
        revers(list);
        
    }
    public static LinkedList revers(LinkedList<Integer> list) {
        System.out.println(list);
        int count = list.size();
        while (count >= 0) {
            int val = list.getFirst();
            list.add(count, val);
            list.removeFirst();
            count -= 1;
        }
        System.out.println(list);
        return list;
    } 
    
}