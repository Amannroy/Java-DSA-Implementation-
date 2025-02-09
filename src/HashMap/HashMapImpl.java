package HashMap;

import java.util.HashMap;

public class HashMapImpl {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        int age = map.get("Alice");
       // map.remove("Bob");
        System.out.println(map.get("Bob"));


        System.out.println(map.containsKey("Kartik"));
    }
}
