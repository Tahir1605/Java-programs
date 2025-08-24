import java.util.Scanner;
class CoPrime
 {
    public static void main(String[] args)
      {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = obj.nextInt();
        System.out.println("Enter the second number : ");
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
        while(divisor != 0)
          {
             reminder = dividend%divisor;
             dividend = divisor;
             divisor = reminder;
          }
        if(dividend == 1)
          {
             System.out.println("Co prime");
          }
        else
          {
             System.out.println("not co prime");
          }
      }
 }