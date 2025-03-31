import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Lab4Task1_2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Argen");
        hs.add("Roma");
        hs.add("Emir");
        hs.add("Joma");
        hs.add("Sanya");
//        hs.add("Sanya");

        System.out.println("Список: " + hs);

        hs.remove("Argen");
        System.out.println("Список после удаления Argen: " + hs);

        boolean argen = hs.contains("Argen");
        System.out.println("Есть ли Argen в списке: " + argen);

        int razmer = hs.size();
        System.out.println("Размер списка: " + razmer);

        boolean pust = hs.isEmpty();
        System.out.println("Пустой ли список: " + pust);

        Object cln = hs.clone();
        System.out.println("Клон списка: " + cln);

        System.out.println("Хэшкоды:");
        for (String o : hs) {
            int hashcode = o.hashCode();
            System.out.println(o + " " + hashcode);
        }
    }
}
