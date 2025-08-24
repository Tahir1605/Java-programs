import java.util.Scanner;
class LcmOfTwoNumber
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
         int lcm = (a*b)/dividend;
         System.out.println("LCM of "+a+" and "+b+" is "+lcm);
         obj.close();
      }
  }