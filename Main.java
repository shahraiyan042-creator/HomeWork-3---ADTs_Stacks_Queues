public class Main {

    // =========================
    // STACK Methods
    // =========================
    static class Stack {

        int[] stack = new int[10];
        int top = -1;

        // Add an item to the stack
        public void push(int value) {
            top = top + 1;
            stack[top] = value;
        }

        // Remove the top item = LIFO
        public int pop() {
            int value = stack[top];
            top = top - 1;
            return value;
        }

        // Look at the top item = LIFO
        public int peek() {
            return stack[top];
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }
    }


    // =========================
    // QUEUE Methods
    // =========================
    static class Queue {

        int[] queue = new int[10];
        int front = 0;
        int back = 0;

        // Add an item to the queue = FIFO
        public void enqueue(int value) {
            queue[back] = value;
            back = back + 1;
        }

        // Remove the first item = FIFO
        public int dequeue() {

            int value = queue[front];

            // Move everything one position to the left
            for (int i = 0; i < back - 1; i++) {
                queue[i] = queue[i + 1];
            }

            back = back - 1;

            return value;
        }

        // Look at the first item = FIFO
        public int peek() {
            return queue[front];
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return back == 0;
        }
    }


    // =========================
    // MAIN
    // =========================
    public static void main(String[] args) {
        // -------------------------
        // STACK DEMONSTRATION
        // -------------------------

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


        // -------------------------
        // QUEUE DEMONSTRATION
        // -------------------------

        Queue queue = new Queue();

        System.out.println();
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

