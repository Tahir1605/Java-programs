import java.util.Scanner;

class Queue {
    int n = 5;
    int[] qu = new int[n];
    int rear, front;

    Queue() {
        for (int i = 0; i < n; i++) {
            qu[i] = 0;
        }
        rear = front = -1;
    }

    void insert(Scanner obj) {
        System.out.println("Enter the data:");
        int data = obj.nextInt();
        if (rear == (n - 1)) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = rear + 1;
            qu[rear] = data;
        }
    }

    int delete() {
        int ret = 0;
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1; // invalid value to indicate failure
        } else if (front == rear) {
            ret = qu[front];
            front = rear = -1;
            return ret;
        } else {
            ret = qu[front];
            front = front + 1;
            return ret;
        }
    }

    void display() {
        if (rear == -1 || front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (int j = front; j <= rear; j++) {
                System.out.println(qu[j]);
            }
        }
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue obj1 = new Queue();
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
                    obj1.insert(obj2); // pass Scanner object
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
