// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения

import java.io.*;

public class ProgramTwo {

    private static final char[] test = null;

    public StringBuilder CreatureStringBuilder() {
        StringBuilder test = new StringBuilder();
        for (int i = 0; i < 100; i++){
            test.append("TEST");
        }
    return test;
    }
    public static void WritingToAFile(String[] args){
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write(test);
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        } 
    }

    /* Вариант 2
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt");
            for (int i = 0; i < 100; i++){
            writer.write("TEST");
            }
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    */
}
