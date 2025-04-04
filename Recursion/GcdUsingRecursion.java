import java.util.Scanner;
class GcdUsingRecursion
  {
     public static int printGcd(int m,int n)
       {
         int rem = m%n;
         if(rem == 0)
           {
              return n;
           }
         else
           {
              return printGcd(n,rem);
           }
       }
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter First Number : ");
          int a = obj.nextInt();
          System.out.println("Enter Second Number : ");
          int b = obj.nextInt();
          int dividend = 0;
          int divisor = 0;
          int reminder = 0;
          if(a>b)
            {
               dividend = a;
               divisor = b;
            }
          else
            {
               dividend = b;
               divisor = a;
            }
          System.out.println("Gcd = "+printGcd(dividend,divisor));
       }
  }