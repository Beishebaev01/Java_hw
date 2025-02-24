import java.util.Scanner;

public class Lab2Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки с клавиатуры
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Находим середину строки
        int middleIndex = input.length() / 2;

        // Удаляем символы с первого до середины
        String result = input.substring(middleIndex);

        // Выводим результат
        System.out.println("Результат: " + result);
    }
}