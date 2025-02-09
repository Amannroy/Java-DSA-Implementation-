package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('A');
        stack.push('B');
        stack.pop();
        System.out.println(stack);

    }
}
