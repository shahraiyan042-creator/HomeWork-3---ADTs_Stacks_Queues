
import java.util.Arrays;

public class Main {
    // --------------------
    // Stack
    // --------------------
    static class Stack {
        private int[] stack;
        private int top;

        //No arg constructor
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

        //No arg Constructor
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

    
}

