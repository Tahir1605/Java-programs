import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        int decimal = 0;
        int power = 0;

        // Loop from rightmost digit to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            char ch = binary.charAt(i);
            if (ch == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal value: " + decimal);
        sc.close();
    }
}
