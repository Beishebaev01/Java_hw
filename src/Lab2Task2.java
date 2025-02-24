import java.util.Scanner;

public class Lab2Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Массив для хранения фамилий
        String[] surnames = new String[2];

        // Ввод фамилий
        System.out.print("Введите фамилию первого человека: ");
        surnames[0] = scanner.nextLine();

        System.out.print("Введите фамилию второго человека: ");
        surnames[1] = scanner.nextLine();

        // Проверка на совпадение фамилий
        if (surnames[0].equals(surnames[1])) {
            System.out.println("Эти люди являются однофамильцами.");
        } else {
            System.out.println("Эти люди не являются однофамильцами.");
        }
    }
}