import java.util.Scanner;

public class Lab2Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZбвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (consonants.indexOf(currentChar) != -1) {
                System.out.println("Первый согласный символ в строке: " + currentChar);
                return;
            }
        }
        System.out.println("В строке нет согласных символов.");
    }
}