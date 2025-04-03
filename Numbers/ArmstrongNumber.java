import java.util.Scanner;
class ArmstrongNumber
  {
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = obj.nextInt();
         int s = 0;
         int x = n;
         while(n>0)
           {
             int r = n%10;
             s = s+(r*r*r);
             n = n/10;
           }
         if(x == s)
          {
             System.out.println("Armstrong");
          }
         else
          {
              System.out.println("Not Armstrong");
          }
         
         obj.close();
      }
  }