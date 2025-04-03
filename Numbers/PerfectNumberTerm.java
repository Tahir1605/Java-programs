import java.util.Scanner;
class PerfectNumberTerm
  {
    public static int isPerfect(int num)
     {
        int sum = 0;
        for(int i = 1; i < num ; i++)
          {
             if(num%i == 0)
               {
                  sum = sum+i;
               }
          }  
         if(sum == num)
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
             if(isPerfect(i) == 1)
               { 
                  System.out.println(i);
               }
          }
        obj.close();
     }
  }