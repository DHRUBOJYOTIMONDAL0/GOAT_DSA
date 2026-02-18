import java.util.Scanner;

public class Create_Queqe {

    static int[] queue;
    static int front = 0;
    static int rear = 0;
    static int size;

    static void enqueue(int x) {
        if (rear == size) {
            System.out.println("Queue is Full");
        } else {
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
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter queue size:");
        size = sc.nextInt();
        queue = new int[size];

        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.println("Enter operation (1 = Enqueue, 2 = Dequeue):");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter value:");
                int value = sc.nextInt();
                enqueue(value);
            } else if (choice == 2) {
                dequeue();
            }
        }

        sc.close();
    }
}

