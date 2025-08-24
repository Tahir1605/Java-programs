import java.util.Scanner;
class HappyNumber
  {
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int num = obj.nextInt();
         int sum = num;
         while(sum != 1 && sum != 4)
           {
              int temp = sum;
              sum = 0;
              while(temp > 0)
                {
                  int r = temp%10;
                  sum = sum + (r*r);
                  temp = temp/10;
                }
           }
         if(sum == 1)
           {
              System.out.println("Happy Number");
           }
         else
           {
              System.out.println("Not happy number");
           }
      }
  }