package LinkedList;

class Node{
    int data; // Data part
    Node next; // Reference to the next node

    // Constructor to create a new node
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

/*

LinkedList Class:
The LinkedList class manages the operations like:

Insertion (at the beginning, end, or middle).
Deletion (from the beginning, end, or by value).
Traversal (displaying the list)
 */
public class LinkedList {
    Node head;   // Head of the list

    // Constructor to initialize the list
    public LinkedList(){
        head = null;
    }

    // Insert a new node at the end of the list
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Insert a new node at the beginning of the list
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete a node by value
    public void deleteByValue(int data){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        // If the head node is the one to be deleted
        if(head.data == data){
            head = head.next;
            return;
        }

        // If the node to delete
        Node temp = head;
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }

        // If data was not found
        if(temp.next == null){
            System.out.println("Element not found.");
            return;
        }

        // Skip the node to delete it
        temp.next = temp.next.next;
    }

    // Traverse the linked list and print the elements
    public void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

}
