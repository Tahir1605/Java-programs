import java.util.Scanner;
class Recursion01
  {
     static void print(int n)
       {
          if(n == 0)
            {
                return;
            }

          print(n-1);

          System.out.println(n);
       }
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter the term : ");
          int x = obj.nextInt();
          print(x);
          obj.close();
       }
  }