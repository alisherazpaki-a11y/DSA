import java.util.Scanner;

public class StackLinklist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 1;

        while (choice <= 6) {

            System.out.println("\n===== STACK USING LINKED LIST =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. isEmpty");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter value: ");
                int value = input.nextInt();

                Node newNode = new Node(value);

                newNode.next = top;
                top = newNode;

                System.out.println("Value pushed successfully.");

            } else if (choice == 2) {

                if (top == null) {
                    System.out.println("Stack Underflow. Stack is empty.");
                } else {
                    System.out.println("Popped value: " + top.data);
                    top = top.next;
                }

            } else if (choice == 3) {

                if (top == null) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Top value: " + top.data);
                }

            } else if (choice == 4) {

                if (top == null) {
                    System.out.println("Stack is empty.");
                } else {

                    Node current = top;

                    System.out.println("Stack elements:");

                    while (current != null) {
                        System.out.println(current.data);
                        current = current.next;
                    }
                }

            } else if (choice == 5) {

                if (top == null) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Stack is not empty.");
                }

            } else if (choice == 6) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}
