import java.util.Scanner;
import java.util.Random;

public class practic2 {

    static String[][] riddles = new String[][] {
            {"Висит груша, нельзя скушать", "лампочка"},
            {"Что принадлежит вам, но другие используют это чаще, чем вы?", "имя"},
            {"Что становится влажным, пока сушит?", "полотенце"},
            {"Чем больше из неё берёшь, тем больше она становится", "яма"}
    };

    public static int randomIndex() {
        Random rand = new Random();
        return rand.nextInt(riddles.length);
    }

    public static String[] getRiddle(int index) {
        return riddles[index];
    }

    public static boolean checkAnswer(String userAnswer, String correctAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        int riddleIndex = randomIndex();
        String[] riddle = getRiddle(riddleIndex);
        String question = riddle[0];
        String correctAnswer = riddle[1];

        System.out.println("Загадка: " + question);

        while (attempts > 0) {
            System.out.print("Ваш ответ: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase("Сдаюсь")) {
                System.out.println("Правильный ответ: " + correctAnswer);
                break;
            }

            if (checkAnswer(userAnswer, correctAnswer)) {
                System.out.println("Правильно!");
                break;
            }
            else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Неверно. Осталось попыток: " + attempts);
                }
                else {
                    System.out.println("Неверно. Вы исчерпали все попытки. Правильный ответ: " + correctAnswer);
                }
            }
        }
        scanner.close();
    }
}
