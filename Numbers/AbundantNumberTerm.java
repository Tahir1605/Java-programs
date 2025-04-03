import java.util.Scanner;
class AbundantNumberTerm
 {
   public static int isAbundantNumber(int n)
    {
       int sum = 0;
       for(int i = 1; i < n; i++)
         {
            if(n%i == 0)
              {
                sum = sum+i;
              }
         }
        if(sum > n)
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
           if(isAbundantNumber(i) == 1)
            {
              System.out.println(i);
            }
        }
      obj.close();
    }
 }