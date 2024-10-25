public class Q25 {
}
// 25. Write a Java Program to Implement Stack Using Array
class Stack {
    int[] stack;
    int top;
    int maxSize;
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;  }

    public boolean isFull() { return top == maxSize –1; }
    public boolean isEmpty() { return top == -1; }
    public void push(int value) {
        if (isFull()) { System.out.println("Stack Overflow"); }
        else {  stack[++top] = value;
            System.out.println(value + " pushed to stack"); }   }
    public void pop() {
        if (isEmpty()) {  System.out.println("Stack Underflow"); }
        else {  System.out.println(stack[top--] + " popped from stack"); }
        public void peek() {
            if (isEmpty()) {  System.out.println("Stack is empty"); }
            else {  System.out.println("Top element is " + stack[top]); }   }
        public void display() {
            if (isEmpty()) { System.out.println("Stack is empty");
            } else {  System.out.print("Stack: ");
                for (int i = 0; i <= top; i++) {  System.out.print(stack[i] + " ");  }
                System.out.println(); }  }  }
    public class StackExample {
        public static void main(String[] args) {
            Stack stack = new Stack(5);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.display();
            stack.pop();
            stack.display();
            stack.peek(); }  }  }
