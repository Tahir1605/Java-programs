import java.util.Scanner;
class GcdOfTwoNumber
  {
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter first number : ");
         int a = obj.nextInt();
         System.out.println("Enter Second number : ");
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
         while(divisor!=0)
           {
              reminder = dividend%divisor;
              dividend = divisor;
              divisor = reminder;
           }
         System.out.println("GCD = "+dividend);
         obj.close();
      }
  }