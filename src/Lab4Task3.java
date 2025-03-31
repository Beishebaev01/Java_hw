import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lab4Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10) + 1;
        }
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        // 1. Копирование части из старого массива в новый
        int[] subArray = new int[4];
        System.arraycopy(numbers, 2, subArray, 0, 4);
        System.out.println("Подмассив: " + Arrays.toString(subArray));

        // 2. Поиск уникальных чисел
        Set<Integer> unique = new HashSet<>();
        for (int num : numbers) {
            unique.add(num);
        }
        System.out.println("Уникальные числа: " + unique);

        // 3. Поиск max, min и суммы
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
        System.out.println("Сумма: " + sum);
    }
}
