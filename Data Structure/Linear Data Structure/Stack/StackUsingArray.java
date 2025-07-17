import java.util.Scanner;

class Stack {
    int[] st = new int[5];
    int top;

    Stack() {
        for (int i = 0; i < 5; i++) {
            st[i] = 0;
        }
        top = -1;
    }

    void push() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int data = obj.nextInt();
        if (top == 4) {
            System.out.println("Stack is full");
        } else {
            top = top + 1;
            st[top] = data;
        }
    }

    int pop() {
        int ret = 0;
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            ret = st[top];
            top = top - 1;
            return ret;
        }
        return ret;
    }

    void display() {
        if (top == -1) {
            System.out.println("Element not present");
        } else {
            for (int j = top; j >= 0; j--) {
                System.out.println(st[j]);
            }
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack obj1 = new Stack();
        Scanner obj2 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter Your Choice : ");
            ch = obj2.nextInt();

            switch (ch) {
                case 1:
                    obj1.push();
                    break;
                case 2:
                    int x = obj1.pop();
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
