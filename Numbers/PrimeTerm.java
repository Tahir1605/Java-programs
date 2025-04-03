import java.util.Scanner;
class PrimeTerm
  {
     public static int isPrime(int num)
      {
         int f = 0;
         for(int i = 1;i <= num;i++)
            {
               if(num%i == 0)
                 {
                   f = f+1;
                 }
            }
          if(f == 2)
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
         for(int i = 1;i <= n;i++)
          {
             if(isPrime(i) == 1)
              {
                System.out.println(i);
              }
          }
         obj.close();
      }
  }