import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab4Task4 {
    public static void main(String[] args) {
        String text1 = "Hello, Argen! My name is Argen!";
        String text2 = "Being Argen is cool!";

        System.out.println("Анализ строки: " + text1);

        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : text1.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        System.out.println("Частота символов: " + charFrequency);

        String[] words = text1.split("\\W+");
        Map<String, Integer> word = new HashMap<>();
        for (String w : words) {
            word.put(w, word.getOrDefault(w, 0) + 1);
        }
        System.out.println("Частота слов: " + word);

        Set<Character> uniqChars = new HashSet<>();
        for (char c : text1.toCharArray()) {
            uniqChars.add(c);
        }
        for (char c : text2.toCharArray()) {
            uniqChars.add(c);
        }
        System.out.println("Символы, содержащиеся хотя бы в одной строке: " + uniqChars);
    }
}
