import java.util.Scanner;
class SpecialNumberTerm
  {
    public static int isSpecial(int num)
      {
          int s = 0;
          int sum = 0;
          int mul = 1;
          int x = num;
          while(num>0)
            {
               int r = num%10;
               s = s+r;
               mul = mul*r;
               num = num/10;
            }
          sum = s+mul;
          if(sum == x)
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
         for(int i = 1; i <= n; i++)
          {
              if(isSpecial(i) == 1)
               {
                  System.out.println(i);
               }
          }
         obj.close();
      }
  }