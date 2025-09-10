import java.util.Scanner;
class LargestAmongThree
  {
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter the first number : ");
          int num1 = obj.nextInt();
          System.out.println("Enter the second number : ");
          int num2 = obj.nextInt();
          System.out.println("Enter the third number : ");
          int num3 = obj.nextInt();
          if(num1 > num2)
            {
               if(num1 > num3)
                  {
                     System.out.println("Largest number is "+num1);
                  }
               else
                  {
                     System.out.println("Largest number is "+num3);
                  }
            }
          else if(num2 > num3)
            {
               System.out.println("Largest number is "+num2);
            }
          else
            {
               System.out.println("All number is equal");
            }

         obj.close();
       }
  }