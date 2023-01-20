// Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();

        boolean liapYear;
        if (year % 400 == 0){
            liapYear = true;
        } else if (year % 100 == 0){
            liapYear = false;
        } else if (year % 4 == 0){
            liapYear = true;
        } else {
            liapYear = false;
        }
        System.out.println(+ year + " leap year? -> " + liapYear);
    }
}