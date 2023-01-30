// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Prog1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(1, 100);
            arraylist.add(val);
        }

        System.out.println("Изначальный массив: " + arraylist);
        System.out.println("Максимальный элемент: " + Collections.max(arraylist));
        System.out.println("Mинимальный элемент: " + Collections.min(arraylist));

        int sumItems = 0;
        for (int item : arraylist){
            sumItems += item;
        }

        float average = (float)sumItems/arraylist.size();

        System.out.println("Cреднее арифметическое: " + average);
    }
    
}
