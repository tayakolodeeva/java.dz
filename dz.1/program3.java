// Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;
import java.util.Random;

public class program3 {
    public static void main(String[] args){

    int[] array = new int[20];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(4);
            System.out.print(array[i] + " ");
            }

    System.out.println();

        int lastIndex = array.length-1;

        for(int i = lastIndex; i >=0; i--) {
            if(array[i] == 3) {
                    
                for(int j = i; j < lastIndex; j++) {
                    if(array[j+1] == 3 || j == lastIndex) {
                           
                        break;
                    }
                    else {
                            
                        int temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    
            System.out.println(Arrays.toString(array));
    }

}



    

    
