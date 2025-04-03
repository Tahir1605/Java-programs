import java.util.Scanner;
class HarshadNumberTerm
  {
     public static int isHarshadNumber(int n)
       {
           int sum = 0;
           int x = n;
           while(n>0)
            {
               int r = n%10;
               sum = sum+r;
               n = n/10;
            }
            if(x%sum == 0)
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
                if(isHarshadNumber(i) == 1)
                  {
                     System.out.println(i);
                  }
             }
           obj.close();
       }
  }