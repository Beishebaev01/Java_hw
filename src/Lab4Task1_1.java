import java.util.LinkedList;

public class Lab4Task1_1 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        numbers.add(1, 2);
        System.out.println("Список: " + numbers);

        numbers.addAll(2, numbers);
        System.out.println("Метод addAll(): " + numbers);

        numbers.addFirst(0);
        System.out.println("Метод addFirst(): " + numbers);

        numbers.addLast(101);
        System.out.println("Метод addLast(): " + numbers);

        System.out.println("Метод indexOf(): " + numbers.indexOf(2));
        System.out.println("Метод lastindexOf(): " + numbers.lastIndexOf(6));

        System.out.println("Метод get(): " + numbers.get(6));
        System.out.println("Метод getFirst(): " + numbers.getFirst());
        System.out.println("Метод getLast(): " + numbers.getLast());

        System.out.println("Метод isEmpty(): " + numbers.isEmpty());

        numbers.set(11, 100);
        System.out.println("Список после set(): " + numbers);

        System.out.println("Метод size(): " + numbers.size());

        System.out.println("Метод subList(): " + numbers.subList(9, 11));

        System.out.println("Метод contains(): " + numbers.contains(100));

        numbers.remove(1);
        System.out.println("Список после remove(): " + numbers);

        numbers.removeFirst();
        System.out.println("Список после removeFirst(): " + numbers);

        numbers.removeLast();
        System.out.println("Список после removeLast(): " + numbers);
    }
}
