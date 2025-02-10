import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            int temp = arr[i] + arr[i + 1];

        }
    }
}
