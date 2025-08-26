import java.util.Scanner;
class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        String hex = "";
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        int n = num;
        while(n > 0) {
            hex = hexDigits[n % 16] + hex; 
            n = n / 16;
        }
        
        System.out.println("Hexadecimal: " + hex);
        sc.close();
    }
}
