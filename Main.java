
import java.util.Arrays;

public class Main {

    // --------------------
    // Stack
    // --------------------
    static class Stack {
        private int[] stack;
        private int top;

        public Stack() {
            stack = new int[10];
            top = -1;
        }

        public void push(int value) {
            top++;
            stack[top] = value;
        }

        public int pop() {
            int value = stack[top];
            top--;
            return value;
        }

        public int peek() {
            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    // --------------------
    // Queue
    // --------------------
    static class Queue {
        private int[] queue;
        private int front;
        private int back;

        public Queue() {
            queue = new int[10];
            front = 0;
            back = 0;
        }

        public void enqueue(int value) {
            queue[back] = value;
            back++;
        }

        public int dequeue() {
            int value = queue[front];

            // Move the remaining items forward
            for (int i = 0; i < back - 1; i++) {
                queue[i] = queue[i + 1];
            }

            back--;
            return value;
        }

        public int peek() {
            return queue[front];
        }

        public boolean isEmpty() {
            return back == 0;
        }
    }

    public static void main(String[] args) {

        // --------------------
        // Stack Demonstration
        // --------------------
        Stack stack = new Stack();

        System.out.println("STACK DEMONSTRATION");
        System.out.println("Adding:");

        stack.push(15);
        System.out.println(15);

        stack.push(25);
        System.out.println(25);

        stack.push(35);
        System.out.println(35);

        stack.push(45);
        System.out.println(45);

        stack.push(55);
        System.out.println(55);

        System.out.println();
        System.out.println("Top item:");
        System.out.println(stack.peek());

        System.out.println();
        System.out.println("Removing:");
        System.out.println(stack.pop());

        System.out.println();
        System.out.println("Removing:");
        System.out.println(stack.pop());

        System.out.println();
        System.out.println("New top:");
        System.out.println(stack.peek());

        System.out.println();
        System.out.println("Is Stack empty?");
        System.out.println(stack.isEmpty());

        System.out.println();

        // --------------------
        // Queue Demonstration
        // --------------------
        Queue queue = new Queue();

        System.out.println("QUEUE DEMONSTRATION");
        System.out.println("Adding:");

        queue.enqueue(15);
        System.out.println(15);

        queue.enqueue(25);
        System.out.println(25);

        queue.enqueue(35);
        System.out.println(35);

        queue.enqueue(45);
        System.out.println(45);

        queue.enqueue(55);
        System.out.println(55);

        System.out.println();
        System.out.println("Front item:");
        System.out.println(queue.peek());

        System.out.println();
        System.out.println("Removing:");
        System.out.println(queue.dequeue());

        System.out.println();
        System.out.println("Removing:");
        System.out.println(queue.dequeue());

        System.out.println();
        System.out.println("New front:");
        System.out.println(queue.peek());

        System.out.println();
        System.out.println("Is Queue empty?");
        System.out.println(queue.isEmpty());
    }
}

