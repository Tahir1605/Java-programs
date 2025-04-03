import java.util.Scanner;
class SumOfDigit
  {
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = obj.nextInt();
         int s = 0;
         while(n>0)
           {
             int r = n%10;
             s = s+r;
             n = n/10;
           }
         System.out.println("Sum of Digit is "+s);
         obj.close();
      }
  }