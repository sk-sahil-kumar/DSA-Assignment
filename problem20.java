import java.util.Scanner;

class Problem20 {

    static class Stack {
        int maxSize;
        int top;
        int[] arr;

        // Constructor to initialize stack
        Stack(int size) {
            maxSize = size;
            arr = new int[maxSize];
            top = -1; // Empty stack
        }

        // Push operation
        void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push " + data);
            } else {
                arr[++top] = data;
                System.out.println(data + " pushed into stack.");
            }
        }

        // Pop operation
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Cannot pop element.");
                return -1;
            } else {
                return arr[top--];
            }
        }

        // Check if stack is empty
        boolean isEmpty() {
            return top == -1;
        }

        // Check if stack is full
        boolean isFull() {
            return top == maxSize - 1;
        }

        // Display stack elements
        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
            } else {
                System.out.print("Stack elements: ");
                for (int i = 0; i <= top; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1)
                        System.out.println("Popped element: " + popped);
                    break;
                case 3:
                    stack.display();
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
