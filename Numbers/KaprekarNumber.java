import java.util.Scanner;

class KaprekarNumber {
    public static boolean isKaprekar(int n) {
        if (n == 1) {
            return true;
        }

        long square = (long) n * n;
        String squareStr = String.valueOf(square);

        int len = squareStr.length();
        int mid = len / 2; // split at the middle

        String first = squareStr.substring(0, mid);
        String second = squareStr.substring(mid);

        // Handle empty strings
        int num1 = first.isEmpty() ? 0 : Integer.parseInt(first);
        int num2 = second.isEmpty() ? 0 : Integer.parseInt(second);

        int sum = num1 + num2;

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = obj.nextInt();

        if (isKaprekar(num)) {
            System.out.println("It is a Kaprekar number");
        } else {
            System.out.println("It is not a Kaprekar number");
        }
        obj.close();
    }
}
