import java.util.Scanner;

class Deque {
    int[] deque;
    int front;
    int rear;
    int size;
    int capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Insert at front

    public void insertFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) { // First element
            front = rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }

        deque[front] = item;
        size++;
    }

    // Insert at rear

    public void insertRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) { // First element
            front = rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }

        deque[rear] = item;
        size++;
    }

    // Delete from front

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted from front: " + deque[front]);

        if (front == rear) {
            front = rear = -1; // Queue becomes empty
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }

        size--;
    }

    // Delete from rear

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted from rear: " + deque[rear]);

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }

        size--;
    }

    // Display deque

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deque elements are:");
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    // Main method with menu

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque dq = new Deque(5);
        int choice;

        do {
            System.out.println("\n---- Deque Menu ----");
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
                    dq.insertFront(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value to insert at rear: ");
                    dq.insertRear(sc.nextInt());
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
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
