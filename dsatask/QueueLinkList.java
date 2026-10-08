import java.util.Scanner;

public class QueueLinkList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 1;

        while (choice <= 7) {

            System.out.println("\n===== QUEUE USING LINKED LIST =====");
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

                // Enqueue
                System.out.print("Enter value: ");
                int value = input.nextInt();

                Node newNode = new Node(value);

                if (front == null) {

                    front = newNode;
                    rear = newNode;

                } else {

                    rear.next = newNode;
                    rear = newNode;
                }

                System.out.println("Value inserted successfully.");

            } else if (choice == 2) {

                // Dequeue
                if (front == null) {

                    System.out.println("Queue Underflow. Queue is empty.");

                } else {

                    System.out.println("Deleted value: " + front.data);

                    front = front.next;

                    if (front == null) {
                        rear = null;
                    }
                }

            } else if (choice == 3) {

                // Peek
                if (front == null) {

                    System.out.println("Queue is empty.");

                } else {

                    System.out.println("Front value: " + front.data);
                }

            } else if (choice == 4) {

                // Display
                if (front == null) {

                    System.out.println("Queue is empty.");

                } else {

                    System.out.println("Queue elements:");

                    Node current = front;

                    while (current != null) {

                        System.out.println(current.data);

                        current = current.next;
                    }
                }

            } else if (choice == 5) {

                // isEmpty
                if (front == null) {

                    System.out.println("Queue is empty.");

                } else {

                    System.out.println("Queue is not empty.");
                }

            } else if (choice == 6) {

                // isFull
                // Linked List normally does not have a fixed size.
                System.out.println("Queue is not full (Dynamic Linked List).");

            } else if (choice == 7) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}