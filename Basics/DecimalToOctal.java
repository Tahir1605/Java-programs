import java.util.Scanner;
class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        String octal = "";
        
        int n = num;
        while(n > 0) {
            octal = (n % 8) + octal;
            n = n / 8;
        }
        
        System.out.println("Octal: " + octal);
        sc.close();
    }
}
