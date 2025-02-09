package HashSet;

import java.util.HashSet;

public class SetImpl {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("Mongo");
        set.remove("Apple");
        boolean contains = set.contains("banana");
        System.out.println(set);
    }
}
