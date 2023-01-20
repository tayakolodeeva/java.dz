// Задать одномерный массив и найти в нем минимальный и максимальный элементы

import java.util.Random;

import Random;

public class program {
    public static void main(String[] args) {
        
        int[] array = new int[10];
        Random rnd = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101);
            System.out.print(array[i] + " ");
            }
        
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }    

        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
    
    System.out.println();
    System.out.println("min value = " + minValue);
    System.out.println("max value = " + maxValue);
    
    }
}
