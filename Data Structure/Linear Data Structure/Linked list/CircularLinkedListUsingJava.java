import java.util.Scanner;

class CircularNode {
    int data;
    CircularNode next;

    public CircularNode(int value) {
        data = value;
        next = null;
    }
}

class CircularLinkedList {
    CircularNode last;

    public void insertEnd(int value) {
        CircularNode newNode = new CircularNode(value);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void deleteFront() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        CircularNode first = last.next;
        if (last == first) {
            System.out.println("Deleted: " + first.data);
            last = null;
        } else {
            System.out.println("Deleted: " + first.data);
            last.next = first.next;
        }
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        CircularNode curr = last.next;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != last.next);
        System.out.println("(back to head)");
    }
}

public class CircularLinkedListUsingJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();
        int choice;

        do {
            System.out.println("\n---- Circular Linked List Menu ----");
            System.out.println("1. Insert at End");
            System.out.println("2. Delete from Front");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    list.insertEnd(sc.nextInt());
                    break;
                case 2:
                    list.deleteFront();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
