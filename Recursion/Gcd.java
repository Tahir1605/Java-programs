import java.util.Scanner;
class Gcd
  {
     static int gcd(int a , int b)
       {
          if(b == 0)
            {
                return a;
            }
          return gcd(b, a%b);
       }
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.print("Enter first number : ");
          int first = obj.nextInt();
          System.out.print("Enter the second number : ");
          int second = obj.nextInt();
          int result = gcd(first , second);
          System.out.println(result);
          obj.close();
       }
  }