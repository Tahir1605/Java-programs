import java.util.Scanner;

class CircularQueue {
    int n = 5;
    int[] qu = new int[n];
    int front, rear;

    CircularQueue() {
        front = rear = -1;
    }

    void insert(Scanner obj) {
        System.out.print("Enter the data: ");
        int data = obj.nextInt();

        // Check if queue is full
        if ((front == 0 && rear == n - 1) || (rear + 1) % n == front) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % n;
            }
            qu[rear] = data;
        }
    }

    int delete() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        int ret = qu[front];
        if (front == rear) { // only one element
            front = rear = -1;
        } else {
            front = (front + 1) % n;
        }
        return ret;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");
        int i = front;
        while (true) {
            System.out.println(qu[i]);
            if (i == rear)
                break;
            i = (i + 1) % n;
        }
    }
}

public class CircularQueueUsingArray {
    public static void main(String[] args) {
        CircularQueue obj1 = new CircularQueue();
        Scanner obj2 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            ch = obj2.nextInt();

            switch (ch) {
                case 1:
                    obj1.insert(obj2);
                    break;
                case 2:
                    int x = obj1.delete();
                    if (x != -1)
                        System.out.println("Deleted item = " + x);
                    break;
                case 3:
                    obj1.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch != 4);
    }
}
