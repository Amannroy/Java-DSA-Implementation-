package Stack;

public class CustomStack {
    private int[] stack;  // This array will store the elements
    private int top;   //  // This variable keeps track of the top of the stack
    private int capacity;  // This is the size of the stack (how many items it can hold)

    // Constructor to initialize the stack with a given capacity
    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;  // initially, the stack is empty
    }

    // Pushes an element onto the stack
    public void push(int value){
        if(top == capacity - 1){
            System.out.println("Stack is full. Cannot push." + value);
        }else{
            stack[++top] = value; // Increment top and add value to the stack
        }
    }

    // pop the top element from the stack
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        }else{
            return stack[top--]; // Return the top value and decrement top
        }
    }

    // Returns the top element without removing it
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        }else{
            return stack[top];  // Return the top value
        }
    }

    // Checks if the stack is empty
    public boolean isEmpty(){
        return top == -1; // Stack is empty if top is -1
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);  // Creating a stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Pooped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
