import java.util.Scanner;
class Factorial
  {
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = obj.nextInt();
         int f = 1;
         for(int i = 1;i <= n; i++)
           {
              f = f*i;
           }
         System.out.println("Factorial = "+f);
      } 
  }