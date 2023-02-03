import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Prog_5_2 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        String employees = "Иван Иванов " + "Светлана Петрова " + "Кристина Белова " + "Анна Мусина " + "Анна Крутова " + "Иван Юрин " + "Петр Лыков " + "Павел Чернов " + "Петр Чернышов " + "Мария Федорова " + "Марина Светлова " + "Мария Савина " + "Мария Рыкова " + "Марина Лугова " + "Анна Владимирова " + "Иван Мечников " + "Петр Петин " + "Иван Ежов ";

        String[] list = employees.split(" ");
        for (int i = 0; i < list.length; i += 2) {
            if (hashMap.containsKey(list[i])) {
                hashMap.replace(list[i], hashMap.get(list[i]) + 1);
            } else {
                hashMap.put(list[i], 1);
            }
        }

        Map<String, Integer> sorted = new LinkedHashMap<>();
        int max = 1;
        for (int value : hashMap.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                if (hashMap.get(key) == i) {
                    sorted.put(key, hashMap.get(key));
                }
            }
        }

        System.out.println(sorted);
    }
    
}
