public class task3 {
    public static void main(String[] args) {

        int[] array = new int[]{2, 5, -1, 10, -3, 90, 23, 10, 11, 43};
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
        System.out.println("Сумма наибольшего и наименьшего элемента: " + sum);
    }
}
