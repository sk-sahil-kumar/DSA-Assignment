import java.util.Scanner;

class Problem21 {

    static class CircularQueue {
        int[] arr;
        int front, rear, size, capacity;

        // Constructor to initialize queue
        CircularQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        // Check if queue is empty
        boolean isEmpty() {
            return size == 0;
        }

        // Check if queue is full
        boolean isFull() {
            return size == capacity;
        }

        // Push operation (enqueue)
        void push(int data) {
            if (isFull()) {
                System.out.println("Queue Overflow! Cannot push " + data);
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            size++;
            System.out.println(data + " enqueued to queue.");
        }

        // Pop operation (dequeue)
        int pop() {
            if (isEmpty()) {
                System.out.println("Queue Underflow! Cannot pop element.");
                return -1;
            }
            int data = arr[front];
            front = (front + 1) % capacity;
            size--;
            return data;
        }

        // Display queue elements
        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Queue elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the circular queue: ");
        int capacity = sc.nextInt();

        CircularQueue queue = new CircularQueue(capacity);

        while (true) {
            System.out.println("\n1. Push (Enqueue)\n2. Pop (Dequeue)\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int data = sc.nextInt();
                    queue.push(data);
                    break;
                case 2:
                    int popped = queue.pop();
                    if (popped != -1)
                        System.out.println("Popped element: " + popped);
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
