// Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Prog2 {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();

        arraylist.add("Меркурий");
        arraylist.add("Венера");
        arraylist.add("Марс");
        arraylist.add("Земля");
        arraylist.add("Марс");
        arraylist.add("Юпитер");
        arraylist.add("Сатурн");
        arraylist.add("Уран");
        arraylist.add("Венера");
        arraylist.add("Нептун");
        arraylist.add("Плутон");

        System.out.println(arraylist);
        List<String> arraylistnew = arraylist.stream()
                                        .collect(Collectors.toSet())
                                        .stream()
                                        .collect(Collectors.toList());
    
        
        System.out.println(arraylistnew);  
    } 
}
