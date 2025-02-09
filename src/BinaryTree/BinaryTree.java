package BinaryTree;

// Class representing a node in a binary tree
class Node{
    int data;
    Node left, right;

    public Node(int item){
        this.data = item;
        this.left = this.right = null;
    }
}

// Class representing a Binary Tree
public class BinaryTree {
    Node root;  // Root node of the binary tree

    // Method to perform inorder traversal (Left, Root, Right)
    public void inorder(Node node){
        // Base Case: If the node is null, return
        if(node == null) return;

        inorder(node.left);
        System.out.println(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();  // Creating an instance of BinaryTree

        // Creating nodes and forming the binary tree structure
        tree.root = new Node(1);  // Root node with value 1
        tree.root.left = new Node(2); // Left child of root (2)
        tree.root.right = new Node(3); // Right child of root (3)

        // Performing inorder traversal
        tree.inorder(tree.root);  // -> 2 1 3
    }
}
