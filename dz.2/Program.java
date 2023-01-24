// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

public class Program {
    public static void main(String[] args) {
        String s = "шалаш";

        System.out.println(Palindrome(s) ? "palindrome" : "not a palindrome");
    }

    private static boolean Palindrome(String s) {
        if (s.length() == 1 || s.length() == 0)
            return true;

        if (s.charAt(0) == s.charAt(s.length() -1))
            return Palindrome(s.substring(1,s.length() -1));
            return false;
        }
}
