import java.util.Scanner;
class Recursion02
  {
     static void print(int n)
       {
          if(n == 0)
            {
                return;
            }
          System.out.println(n);
          print(n-1);
       }
       
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter the term");
          int x = obj.nextInt();
          print(x);
          obj.close();
       }
  }