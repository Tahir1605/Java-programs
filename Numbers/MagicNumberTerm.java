import java.util.Scanner;
class MagicNumberTerm
  {
    public static int isMagic(int n)
     {
         int sum = n;
         while(sum > 9)
            {
                int temp = sum;
                sum = 0;
                while(temp > 0)
                  {
                     int r = temp%10;
                     sum = sum + r;
                     temp = temp/10;
                  }
            }
          if(sum == 1)
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
               if(isMagic(i) == 1)
                 {
                    System.out.println(i);
                 }
            }
         obj.close();
     }
  }