import java.util.Scanner;

class QueueArray {

    static int[][] queue = new int[10][1];

    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 1;

        while (choice <= 7) {

            System.out.println("\n===== QUEUE USING 2D ARRAY =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                if (rear == queue.length - 1) {

                    System.out.println("Queue Overflow. Queue is full.");

                } else {

                    System.out.print("Enter value: ");
                    int value = input.nextInt();

                    if (front == -1) {
                        front = 0;
                    }

                    rear++;
                    queue[rear][0] = value;

                    System.out.println("Value inserted successfully.");
                }

            } else if (choice == 2) {

                if (front == -1 || front > rear) {

                    System.out.println("Queue Underflow. Queue is empty.");

                } else {

                    System.out.println("Deleted value: " + queue[front][0]);

                    front++;

                    if (front > rear) {
                        front = -1;
                        rear = -1;
                    }
                }

            } else if (choice == 3) {

                if (front == -1 || front > rear) {

                    System.out.println("Queue is empty.");

                } else {

                    System.out.println("Front value: " + queue[front][0]);
                }

            } else if (choice == 4) {

                if (front == -1 || front > rear) {

                    System.out.println("Queue is empty.");

                } else {

                    System.out.println("Queue elements:");

                    for (int i = front; i <= rear; i++) {
                        System.out.println(queue[i][0]);
                    }
                }

            } else if (choice == 5) {

                if (front == -1 || front > rear) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Queue is not empty.");
                }

            } else if (choice == 6) {

                if (rear == queue.length - 1) {
                    System.out.println("Queue is full.");
                } else {
                    System.out.println("Queue is not full.");
                }

            } else if (choice == 7) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}