package Arrays;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits List: " + fruits);

        System.out.println("Fruits List: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("Size of Fruits List: " + fruits.size());

        // Loop through the ArrayList
        System.out.println("Iterating through the list:");
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
