import java.util.Scanner;
class Factorial
  {
     static int fact(int n)
       {
          if(n == 0)
            {
                return 1;
            }
          return n*fact(n-1);
       }
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int x = obj.nextInt();
          int result = fact(x);
          System.out.println(result);
          obj.close();
       }
  }