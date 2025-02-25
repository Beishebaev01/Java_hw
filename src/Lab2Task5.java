import java.util.Scanner;

public class Lab2Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        int middleIndex = input.length() / 2;

        String result = input.substring(middleIndex);

        System.out.println("Результат: " + result);
    }
}