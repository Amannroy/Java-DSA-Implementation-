package LinkedList;


import java.util.LinkedList;

public class LinkedListImp {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.removeFirst();
        String first = list.get(0);

        System.out.println(first);
    }
}
