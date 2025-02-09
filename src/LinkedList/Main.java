package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // insert elements into the list
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);

        System.out.println("Linked list after insertions:");
        list.traverse();

        System.out.println("Is 20 in the list? " + list.search(20));
        System.out.println("Is 50 in the list? " + list.search(50));

        list.deleteByValue(20);
        System.out.println("Linked List after deleting 20:");
        list.traverse();
    }
}
