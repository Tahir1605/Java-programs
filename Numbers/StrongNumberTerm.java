import java.util.Scanner;
class StrongNumberTerm
  {
    public static int fact(int n)
      {
         if(n == 0 || n == 1)
           {
              return 1;
           }
         return n*fact(n-1);
      }
    public static int isStrongNumber(int number)
      {
         int x = number;
         int sum = 0;
         while(number>0)
           {
              int r = number%10;
              sum = sum + fact(r);
              number = number/10;
           }
         if(x == sum)
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
              if(isStrongNumber(i) == 1)
                {
                   System.out.println(i);
                }
           }
         obj.close();
      }
  }