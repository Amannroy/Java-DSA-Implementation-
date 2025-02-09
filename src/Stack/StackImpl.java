package Stack;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();  // A stack is created where integers are stored

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();

        System.out.println("Top after peek: " + stack.peek());
    }
}
