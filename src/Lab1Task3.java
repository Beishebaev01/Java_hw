import java.util.Random;

public class Lab1Task3 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random rand = new Random();

        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            else if (array[i] < min) {
                min = array[i];
            }
        }

        int sum = max + min;
        System.out.print("\nСумма наибольшего " + max + " и наименьшего " + min + " элементов: " + sum);
    }
}
