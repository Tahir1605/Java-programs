import java.util.Scanner;
class SpyNumberTerm
  {
    public static int isSpyNumber(int n)
      {
         int sum = 0;
         int mul = 1;
         while(n > 0)
           {
              int r = n%10;
              sum = sum+r;
              mul = mul*r;
              n = n/10;
           }
         if(sum == mul)
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
         int num = obj.nextInt();
         for(int i = 1; i <= num; i++)
            {
               if(isSpyNumber(i) == 1)
                 {
                    System.out.println(i);
                 }
            }
      }
  }