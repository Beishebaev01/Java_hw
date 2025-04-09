import java.util.*;

public class Queue_hw {
    private static Queue<String> queue = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить товары в очередь");
            System.out.println("2. Вывести очередь с номерами");
            System.out.println("3. Удалить товары, заканчивающиеся на 'р' и определить размер");
            System.out.println("4. Вытянуть последний элемент без и с удалением");
            System.out.println("5. Проверить наличие товара");
            System.out.println("6. Удалить все, кроме указанных");
            System.out.println("7. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addItems();
                case 2 -> printQueue();
                case 3 -> removeEndingWithRandCheckSize();
                case 4 -> peekLastElement();
                case 5 -> checkItemExists();
                case 6 -> retainItems();
                case 7 -> { return; }
                default -> System.out.println("Некорректный ввод!");
            }
        }
    }
    private static void addItems() {
        System.out.println("Введите товары через запятую:");
        String input = scanner.nextLine();
        queue.addAll(Arrays.asList(input.split(",\s*")));
    }

    private static void printQueue() {
        int index = 1;
        for (String item : queue) {
            System.out.println(index++ + ". " + item);
        }
    }

    private static void removeEndingWithRandCheckSize() {
        int initialSize = queue.size();
        ArrayList<String> list = new ArrayList<>(queue);
        for (String item : list) {
            if (item.endsWith("р")) {
                queue.remove(item);
                System.out.println("Удалены: " + item);
            }
        }
        System.out.println("Очередь после удаления: " + queue);
        System.out.println("Удалено элементов: " + (initialSize - queue.size()));
        System.out.println("Размер очереди после удаления: " + queue.size());
    }

    private static void peekLastElement() {
        Deque<String> newqueue = new ArrayDeque<>(queue);
        if (!newqueue.isEmpty()) {
            System.out.println("Последний элемент без удаления: " + newqueue.peekLast());
            System.out.println("Очередь после peekLast(): " + newqueue);
            System.out.println("Последний элемент с удалением: " + newqueue.pollLast());
            System.out.println("Очередь после pollLast(): " + newqueue);
        } else {
            System.out.println("Очередь пуста.");
        }
    }

    private static void checkItemExists() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пустая");
            addItems();
        } else {
            System.out.println("Очередь не пустая");
            System.out.println("Введите название товара для проверки:");
            String item = scanner.nextLine();
            if (queue.contains(item)) {
                System.out.println("Товар есть в очереди.");
            } else {
                System.out.println("Товара нет в очереди.");
            }
        }
    }

    private static void retainItems() {
        System.out.println("Введите товары, которые нужно оставить (через запятую):");
        Set<String> allowedItems = new HashSet<>(Arrays.asList(scanner.nextLine().split(",\s*")));
        queue.retainAll(allowedItems);
    }
}
