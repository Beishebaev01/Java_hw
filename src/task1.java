import java.util.Random;

public class task1 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random rand = new Random();

        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\nНаибольший элемент массива: " + max);
    }
}
