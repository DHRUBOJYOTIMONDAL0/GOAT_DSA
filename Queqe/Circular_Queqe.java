import java.util.Scanner;

public class Circular_Queqe {

    static int[] queue;
    static int front = 0;
    static int rear = 0;
    static int size;
    static void enqueue(int x) {
        if ((rear == size && front == 0) || (rear + 1 == front)) {
            System.out.println("Queue is Full");
        } else {

            if (rear == size) {
                rear = 0;
            }
            queue[rear] = x;
            rear++;
            System.out.println("Enqueued: " + x);
        }
    }

    static void dequeue() {
        if (front == rear) {
            System.out.println("Queue is Empty");
        } else {

            System.out.println("Dequeued: " + queue[front]);
            front++;
            if (front == size) {
                front = 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        size = sc.nextInt();

        queue = new int[size + 1];
        size = size + 1;

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\n1 = Enqueue");
            System.out.println("2 = Dequeue");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                enqueue(sc.nextInt());
            } else if (choice == 2) {
                dequeue();
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}

