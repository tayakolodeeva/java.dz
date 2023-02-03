// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prog_5_1 {
    public static void main(String[] args) {
        Map<String, List<String>> hashMap = new HashMap<>();

        hashMap.put("Иван Иванов", List.of("+79780000001"));
        hashMap.put("Светлана Петрова", List.of("+79780000002", "+79780000003"));
        hashMap.put("Кристина Белова", List.of("+79780000004"));
        hashMap.put("Анна Мусина", List.of("+79780000005"));
        hashMap.put("Анна Крутова", List.of("+79780000006", "+79780000007"));

        System.out.println(hashMap);
    }
}
