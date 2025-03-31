import java.util.HashMap;
import java.util.Map;

public class Lab4Task4 {
    public static void main(String[] args) {
        String text = "Hello, World! My name is Argen!";
        System.out.println("Анализ строки: " + text);

        // Частотный анализ символов
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : text.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        System.out.println("Частота символов: " + charFrequency);

        // Частотный анализ слов
        String[] words = text.split("\\W+");
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        System.out.println("Частота слов: " + wordFrequency);
    }
}
