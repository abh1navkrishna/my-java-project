import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("HashMap: " + map);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(3);

        System.out.println("After removing key 3: " + map);

        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // ============== HashSet ============================

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana");
        System.out.println("HashSet: " + set);

        set.remove("Cherry");

        System.out.println("After removing Cherry: " + set);

        System.out.println("Contains Banana? " + set.contains("Banana"));

        for (String fruit : set) {
            System.out.println(fruit);
        }

    }
}
