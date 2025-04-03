import java.util.Scanner;
class ArmstrongTerm
  {
    public static int isArmstrong(int n)
      {
         int x = n;
         int s = 0;
         while(n>0)
          {
            int r = n%10;
            s = s+(r*r*r);
            n = n/10;
          }
         if(x == s)
          {
             return 1;
          }
         else
          {
             return 0;
          }
      }
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = obj.nextInt();
         for(int i = 1;i <= n; i++)
           {
              if(isArmstrong(i) == 1)
                {
                   System.out.println(i);
                }
           }
         obj.close();
      }
  }