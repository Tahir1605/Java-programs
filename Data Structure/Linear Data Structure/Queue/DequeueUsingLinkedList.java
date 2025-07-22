import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

class Dequeue {
    Node front, rear;

    Dequeue() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void insertFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        System.out.println(data + " inserted at front.");
    }

    void insertRear(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        System.out.println(data + " inserted at rear.");
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Dequeue is empty.");
            return;
        }
        System.out.println(front.data + " deleted from front.");
        front = front.next;
        if (front == null) rear = null;
        else front.prev = null;
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Dequeue is empty.");
            return;
        }
        System.out.println(rear.data + " deleted from rear.");
        rear = rear.prev;
        if (rear == null) front = null;
        else rear.next = null;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Dequeue is empty.");
            return;
        }
        System.out.print("Dequeue elements: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DequeueUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dequeue dq = new Dequeue();
        int choice, value;

        do {
            System.out.println("\n--- DEQUEUE MENU ---");
            System.out.println("1. Insert Front");
            System.out.println("2. Insert Rear");
            System.out.println("3. Delete Front");
            System.out.println("4. Delete Rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at front: ");
                    value = sc.nextInt();
                    dq.insertFront(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at rear: ");
                    value = sc.nextInt();
                    dq.insertRear(value);
                    break;
                case 3:
                    dq.deleteFront();
                    break;
                case 4:
                    dq.deleteRear();
                    break;
                case 5:
                    dq.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
