import java.util.Scanner;
class SumOfN
  {
     static int sum(int n)
       {
          if(n == 0)
            {
                return 0;
            }
          return n + sum(n-1);
       }
     public static void main(String[] args)
       {
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter the term : ");
         int x = obj.nextInt();
         int result = sum(x);
         System.out.println(result);
         obj.close();
       }
  }