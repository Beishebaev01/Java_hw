import java.util.Random;

public class Lab1Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x1 = rand.nextInt(5);
        int d = rand.nextInt(10);
        int n = 10;

        int[] arifprog = createarifprog(x1, d, n);

        System.out.println("Массив: ");
        printarr(arifprog);
    }

    public static int[] createarifprog(int x1, int d, int n) {
        int[] arifprog = new int[n];

        for (int i = 0; i < n; i++) {
            arifprog[i] = x1 + (i + 1) * d;
        }

        return arifprog;
    }

    public static void printarr(int[] arifprog) {
        for (int i = 0; i < arifprog.length; i++) {
            System.out.print(arifprog[i]);
            if (i != arifprog.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
