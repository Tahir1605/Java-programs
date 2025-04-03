import java.util.Scanner;
class FibonacciSeries
   {
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter a number : ");
          int n = obj.nextInt();
          int a = 0;
          int b = 1;
          System.out.println(a);
          System.out.println(b);
          for(int i = 2;i <= n; i++)
             {
               int c = a+b; 
               System.out.println(c);
               a = b;
               b = c;
             }
          obj.close();
       }
   }