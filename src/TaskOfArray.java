import java.util.Random;
import java.util.Scanner;


public class TaskOfArray {
    public static void main(String[] args) {
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1;

        int[] counters = {0, 3};

        Scanner input = new Scanner(System.in);

        while (counters[1] > 0) {
            System.out.println("Угадай число от 1 до 100: ");
            System.out.println("Счетчик №2: " + counters[1]);
            int guess = input.nextInt();

            if (guess <= 0) {
                System.out.println("Число должно быть больше 1!");
            }

            else if (guess > 100) {
                System.out.println("Число должно быть меньше 100!");
            }

            else if (guess > secretNumber) {
                counters[0]++;
                System.out.println("Число больше, чем загаданное! Счетчик №1: " + counters[0]);
            }

            else if (guess < secretNumber) {
                --counters[1];
                System.out.println("Число меньше, чем загаданное!");
                if (counters[1] == 0) {
                    System.out.println("Ты проиграл. Загаданное число: " + secretNumber);
                }
            }

            else {
                System.out.println("Молодец! Угадал!");
                break;
            }
        }
    }
}