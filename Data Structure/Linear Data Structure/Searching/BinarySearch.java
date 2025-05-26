import java.util.Scanner;

class BinarySearch {
    Scanner obj = new Scanner(System.in);
    int n;
    int[] a;
    int f = 0;

    void get() {
        System.out.print("Enter the size of the array: ");
        n = obj.nextInt();
        a = new int[n];

        System.out.println("Enter the elements of the array (in sorted order): ");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
    }

    void search() {
        System.out.print("Enter the element that you want to search: ");
        int x = obj.nextInt();
        int beg = 0;
        int end = n - 1;

        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (a[mid] == x) {
                System.out.println("Element found at position " + (mid + 1));
                f = 1;
                break;
            } else if (a[mid] > x) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }

        if (f == 0) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        BinarySearch obj1 = new BinarySearch();
        obj1.get();
        obj1.search();
    }
}
