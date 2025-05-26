import java.util.Scanner;

class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input original array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] original = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        // Calculate mid
        int mid = n / 2;

        // Create two new arrays
        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[n - mid];

        // Copy elements
        for (int i = 0; i < mid; i++) {
            firstHalf[i] = original[i];
        }

        for (int i = mid; i < n; i++) {
            secondHalf[i - mid] = original[i];
        }

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(original[i] + " ");
        }

        // Print first half
        System.out.print("\nFirst half: ");
        for (int i = 0; i < firstHalf.length; i++) {
            System.out.print(firstHalf[i] + " ");
        }

        // Print second half
        System.out.print("\nSecond half: ");
        for (int i = 0; i < secondHalf.length; i++) {
            System.out.print(secondHalf[i] + " ");
        }
    }
}
