import java.util.Scanner;
class Fibonacci
 {
     static int fibo(int n)
       {
           if(n == 0) return 0;
           if(n == 1) return 1;
           return (fibo(n-1) + fibo(n-2));
       }
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter the number : ");
          int x = obj.nextInt();
          for(int i = 0; i < x; i++)
            {
                System.out.print(fibo(i));
            }
          obj.close();
       }
 }