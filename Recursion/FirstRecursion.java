import java.util.Scanner;
class FirstRecursion
  {
     public static long fact(int n)
        {
           if(n == 0 || n == 1)
             {
                return 1;
             }
           else
             {
                return n*fact(n-1);
             }
        }
     public static void main(String[] args)
        {
           Scanner obj = new Scanner(System.in);
           System.out.println("Enter a number : ");
           int num = obj.nextInt();
           if(num < 0)
             {
                System.out.println("invalid number");
             }
           else
             {
               System.out.println("Factorial of " + num + " is: " + fact(num));
             }
             obj.close();
            
        }
  }