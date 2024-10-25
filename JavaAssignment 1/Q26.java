public class Q26 {
}
// 26. Write a Java Program to Implement Queue Using Array
class Queue {
    int[] queue;
    int front, rear, size, maxSize;

    public Queue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        this.size = 0; }
    public boolean isFull() { return size == maxSize; }
    public boolean isEmpty() { return size == 0; }
    public void enqueue(int value) {
        if (isFull()) { System.out.println("Queue is full"); }
        else { rear = (rear + 1) % maxSize;
            queue[rear] = value;
            size++;
            System.out.println(value + " added to queue"); }  }
    public void dequeue() {
        if (isEmpty()) { System.out.println("Queue is empty"); }
        else { System.out.println(queue[front] + " removed from queue");
            front = (front + 1) % maxSize;
            size--; }   }
    public void display() {
        if (isEmpty()) {  System.out.println("Queue is empty"); }
        else { System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {  System.out.print(queue[(front + i) % maxSize] + " ");  }
            System.out.println(); }  }  }
class QueueExample {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display(); }  }
