package TreeMap;

import java.util.TreeMap;

public class TreeMapImp {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Cherry");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Apple");
        treeMap.put(4, "Orange");
        String fruit = treeMap.get(1);
        Integer key = treeMap.firstKey();
        String value = treeMap.get(2);
        System.out.println(value);
    }
}
