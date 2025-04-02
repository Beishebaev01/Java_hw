import java.util.*;
import java.util.stream.Collectors;

public class Lab4Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new Random().ints(10, 1, 10)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Исходный список: " + numbers);

        List<Integer> subList = new ArrayList<>(numbers.subList(3, 7));
        System.out.println("Подсписок: " + subList);

        Map<Integer, Integer> numcount = new HashMap<>();
        for (int num : numbers) {
            numcount.put(num, numcount.getOrDefault(num, 0) + 1);
        }
        System.out.println(numcount);

        List<Integer> uniq = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numcount.entrySet()) {
            if (entry.getValue() == 1) {
                uniq.add(entry.getKey());
            }
        }
        System.out.println("Уникальные числа: " + uniq);
//        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
//        System.out.println("Уникальные числа: " + uniqueNumbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
        System.out.println("Сумма: " + sum);
    }
}

