import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Lab4Task2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Argentina");
        map.put(2,"Brazil");
        map.put(3,"Canada");

//        boolean k = map.containsKey(1);
//        System.out.println(k);
//        boolean v = map.containsValue("Argentina");
//        System.out.println(v);
//        Object g = map.get(1);
//        System.out.println(g);

        Collection<Integer> keys = map.keySet();
        Collection<String> values = map.values();

        System.out.println("keys: " + keys);
        System.out.println("values: " + values);
    }
}
