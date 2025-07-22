import java.util.Scanner;

class PriorityQueue {
    int capacity;
    int size;
    int[][] queue;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.queue = new int[capacity][2];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item, int priority) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }

        queue[size][0] = item;
        queue[size][1] = priority;
        size++;

        // Sort by priority (ascending)

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (queue[j][1] > queue[j + 1][1]) {
                    int tempItem = queue[j][0];
                    int tempPriority = queue[j][1];

                    queue[j][0] = queue[j + 1][0];
                    queue[j][1] = queue[j + 1][1];

                    queue[j + 1][0] = tempItem;
                    queue[j + 1][1] = tempPriority;
                }
            }
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int removedItem = queue[0][0];

        // Shift left

        for (int i = 0; i < size - 1; i++) {
            queue[i][0] = queue[i + 1][0];
            queue[i][1] = queue[i + 1][1];
        }

        size--;
        return removedItem;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Priority Queue:");
        for (int i = 0; i < size; i++) {
            System.out.println("Item: " + queue[i][0] + ", Priority: " + queue[i][1]);
        }
    }

    // Main method with menu

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue pq = new PriorityQueue(5);

        int choice;

        do {
            System.out.println("\n---- Priority Queue Menu ----");
            System.out.println("1. Enqueue (Add Item)");
            System.out.println("2. Dequeue (Remove Highest Priority Item)");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item value: ");
                    int item = sc.nextInt();
                    System.out.print("Enter priority: ");
                    int priority = sc.nextInt();
                    pq.enqueue(item, priority);
                    break;

                case 2:
                    int removed = pq.dequeue();
                    if (removed != -1) {
                        System.out.println("Dequeued item: " + removed);
                    }
                    break;

                case 3:
                    pq.display();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
