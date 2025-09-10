import java.util.Scanner;
class LargestBetweenTwo
  {
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter the first number : ");
          int first = obj.nextInt();
          System.out.println("Enter the second number : ");
          int second = obj.nextInt();
          if(first > second)
            {
               System.out.println("The large number is "+first);
            }
          else
            {
               System.out.println("The large number is "+second);
            }

         obj.close();
       }
  }