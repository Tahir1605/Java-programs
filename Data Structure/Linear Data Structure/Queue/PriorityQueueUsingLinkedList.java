import java.util.Scanner;

class Node {
    int data;
    int priority;
    Node next;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

class PriorityQueue {
    Node head;

    // Enqueue based on priority (lower number = higher priority)
    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        System.out.println("Enqueued " + data + " with priority " + priority);
    }

    // Dequeue the highest priority (head)
    public void dequeue() {
        if (head == null) {
            System.out.println("Priority Queue is empty.");
            return;
        }
        System.out.println("Dequeued: " + head.data);
        head = head.next;
    }

    // Display the queue
    public void display() {
        if (head == null) {
            System.out.println("Priority Queue is empty.");
            return;
        }
        Node temp = head;
        System.out.println("Priority Queue:");
        while (temp != null) {
            System.out.println("Data: " + temp.data + ", Priority: " + temp.priority);
            temp = temp.next;
        }
    }
}

public class PriorityQueueUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue pq = new PriorityQueue();
        int choice;

        do {
            System.out.println("\n--- Priority Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    System.out.print("Enter priority: ");
                    int priority = sc.nextInt();
                    pq.enqueue(val, priority);
                    break;
                case 2:
                    pq.dequeue();
                    break;
                case 3:
                    pq.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
