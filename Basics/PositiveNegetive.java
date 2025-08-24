import java.util.Scanner;
class PositiveNegetive
  {
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter a number : ");
          int num = obj.nextInt();
          if(num < 0)
            {
              System.out.println("Negetive number");
            }
          else if(num > 0)
            {
              System.out.println("Positive number");
            }
          else
            {
              System.out.println("It is a Zero");
            }
       }
  }