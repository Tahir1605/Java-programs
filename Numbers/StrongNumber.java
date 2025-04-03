import java.util.Scanner;
class StrongNumber
  {
    public static int fact(int n)
      {
         if(n == 0 || n == 1)
           {
              return 1;
           }
         return n*fact(n-1);
      }
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int num = obj.nextInt();
         int x = num;
         int sum = 0;
         while(num>0)
           {
              int r = num%10;
              sum = sum + fact(r);
              num = num/10;
           }
         if(x == sum)
           {
              System.out.println("Strong Number");
           }
         else
           {
              System.out.println("Not Strong Number");
           }
         obj.close();
      }
  }