import java.util.Scanner;

class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and elements of first array
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        // Input size and elements of second array
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = b[i];
        }

        // Print arrays
        System.out.print("First array: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nSecond array: ");
        for (int i = 0; i < n2; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.print("\nMerged array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
