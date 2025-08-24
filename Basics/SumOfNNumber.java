import java.util.Scanner;
class SumOfNNumber
  {
     public static void main(String[] args)
       {
          int sum = 0;
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter a number : ");
          int num = obj.nextInt();
          for(int i = 1; i <= num; i++)
             {
                sum = sum + i;
             }
           System.out.println("Sum of Nth natural number is "+sum);
          obj.close();
       }
  }