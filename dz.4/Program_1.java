import java.util.LinkedList;
import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<>();

        while (true) {
            String text = Text();
            if (text.equalsIgnoreCase("print")) {
                int temp = 0;
                while (temp!= linkList.size() - 1) {
                    linkList.add(linkList.size()-temp, linkList.getFirst());
                    linkList.removeFirst();
                    temp++;
                }
                System.out.println(linkList);
            } else if (text.equalsIgnoreCase("revert")){
                linkList.remove(linkList.size() - 2);
            } else if (text.equalsIgnoreCase("ex")){
                break;
            } else {
                linkList.add(text);
            }
            
        }
    }

    public static String Text() {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: ");

        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
    
}
