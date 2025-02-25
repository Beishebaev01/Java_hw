import java.util.Scanner;

public class Lab2Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] consonants = {
                "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z",
                "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z",
                "б", "в", "г", "д", "ж", "з", "й", "к", "л", "м", "н", "п", "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ",
                "Б", "В", "Г", "Д", "Ж", "З", "Й", "К", "Л", "М", "Н", "П", "Р", "С", "Т", "Ф", "Х", "Ц", "Ч", "Ш", "Щ"
        };

        char firstConsonant = '\0';

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            String currentCharStr = String.valueOf(currentChar);

            for (String consonant : consonants) {
                if (consonant.equals(currentCharStr)) {
                    firstConsonant = currentChar;
                    break;
                }
            }

            if (firstConsonant != '\0') {
                break;
            }
        }

        if (firstConsonant != '\0') {
            System.out.println("Первый согласный символ в строке: " + firstConsonant);
        } else {
            System.out.println("В строке нет согласных символов.");
        }
    }
}