import java.util.Scanner;
class DecimalToBinary 
  {
     public static void main(String[] args) 
       {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a decimal number: ");
          int num = sc.nextInt();
          String binary = "";
        
          int n = num;

          while(n > 0) 
           {
              binary = (n % 2) + binary;  
              n = n / 2;
           }
          
           System.out.println("Binary: " + binary);
           sc.close();
    }
}
