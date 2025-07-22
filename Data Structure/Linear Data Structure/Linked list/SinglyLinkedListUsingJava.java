import java.util.Scanner;

class Node {
    String data;
    Node next;

    public Node(String value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at beginning
    public void insertHead(String value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void append(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Insert after a specific value
    public void insertAfter(String after, String value) {
        Node curr = head;
        while (curr != null && !curr.data.equals(after)) {
            curr = curr.next;
        }
        if (curr != null) {
            Node newNode = new Node(value);
            newNode.next = curr.next;
            curr.next = newNode;
        } else {
            System.out.println("Item not found.");
        }
    }

    // Insert before a specific value
    public void insertBefore(String before, String value) {
        if (head == null) {
            System.out.println("Item not found.");
            return;
        }
        if (head.data.equals(before)) {
            insertHead(value);
            return;
        }

        Node curr = head;
        while (curr.next != null && !curr.next.data.equals(before)) {
            curr = curr.next;
        }

        if (curr.next != null) {
            Node newNode = new Node(value);
            newNode.next = curr.next;
            curr.next = newNode;
        } else {
            System.out.println("Element not found.");
        }
    }

    // Clear list
    public void clear() {
        head = null;
    }

    // Delete first node
    public void deleteHead() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        head = head.next;
    }

    // Delete last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    // Delete by value
    public void remove(String value) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if (head.data.equals(value)) {
            deleteHead();
            return;
        }

        Node curr = head;
        while (curr.next != null && !curr.next.data.equals(value)) {
            curr = curr.next;
        }

        if (curr.next == null) {
            System.out.println("Value not found.");
        } else {
            curr.next = curr.next.next;
        }
    }

    // Search
    public void search(String item) {
        Node curr = head;
        int pos = 0;
        while (curr != null) {
            if (curr.data.equals(item)) {
                System.out.println("Element found at position: " + pos);
                return;
            }
            curr = curr.next;
            pos++;
        }
        System.out.println("Element not found.");
    }

    // Display list
    public void traverse() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

public class SinglyLinkedListUsingJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Insert After");
            System.out.println("4. Insert Before");
            System.out.println("5. Delete All");
            System.out.println("6. Delete First");
            System.out.println("7. Delete Last");
            System.out.println("8. Delete By Value");
            System.out.println("9. Search By Value");
            System.out.println("10. Display");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert first: ");
                    list.insertHead(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter data to insert last: ");
                    list.append(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter value to insert: ");
                    String val3 = sc.nextLine();
                    System.out.print("Enter item after which to insert: ");
                    String after = sc.nextLine();
                    list.insertAfter(after, val3);
                    break;
                case 4:
                    System.out.print("Enter value to insert: ");
                    String val4 = sc.nextLine();
                    System.out.print("Enter item before which to insert: ");
                    String before = sc.nextLine();
                    list.insertBefore(before, val4);
                    break;
                case 5:
                    list.clear();
                    System.out.println("All nodes deleted.");
                    break;
                case 6:
                    list.deleteHead();
                    break;
                case 7:
                    list.deleteLast();
                    break;
                case 8:
                    System.out.print("Enter value to delete: ");
                    list.remove(sc.nextLine());
                    break;
                case 9:
                    System.out.print("Enter value to search: ");
                    list.search(sc.nextLine());
                    break;
                case 10:
                    list.traverse();
                    break;
                case 11:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 11);

        sc.close();
    }
}
