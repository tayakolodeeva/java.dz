// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

import java.util.ArrayList;
import java.util.Random;

public class Prog {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(1, 100);
            arraylist.add(val);
        }

        System.out.println("Изначальный массив: " + arraylist);

        int i = 0;
        while (i < arraylist.size()){
            if (arraylist.get(i) % 2 == 0) {
                arraylist.remove(i);
            } 
            else {
                i++;
            }
            
        }
        System.out.println("Mассив без четных чисел: " + arraylist);
    }
}
