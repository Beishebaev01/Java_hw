import java.util.Scanner;

public class Lab2Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inp = scanner.nextLine();

        int middleIndex = inp.length() / 2;

        StringBuffer result = new StringBuffer();
        result.append(inp);
        result.delete(0, middleIndex);
        result.toString();

        System.out.println("Результат: " + result);
    }
}