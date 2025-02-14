import java.util.Random;

public class task4 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rand = new Random();

        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length - 1; i++) {
            int sum = arr[i - 1] + arr[i + 1];
            if (sum < arr[i]) {
                System.out.println("Сумма элементов " + arr[i - 1] + " " + arr[i + 1] + " меньше чем: " + arr[i] + " ");
            }
            else {
                System.out.println("Сумма элементов " + arr[i - 1] + " " + arr[i + 1] + " " + "больше чем: " + arr[i] + " ");
            }
        }
    }
}
