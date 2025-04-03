import java.util.Scanner;
class HarshadNumber
  {
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int num = obj.nextInt();
         int x = num;
         int sum = 0;
         while(num>0)
          {
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
          }
         if(x%sum == 0)
           {
              System.out.println("Harshad Number");
           }
         else
           {
              System.out.println("Not Harshad Number");
           }
         obj.close();
      }
  }