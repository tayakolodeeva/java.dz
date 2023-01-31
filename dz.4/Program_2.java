// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Program_2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(1, 100);
            linkList.add(val);
        }
        System.out.println("Изначальный: " + linkList);

        int temp = 0;
        while (temp!= linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
        System.out.println("Перевернутый: " + linkList);
    }
    
}
