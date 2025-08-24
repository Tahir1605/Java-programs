import java.util.Scanner;
class NeonNumberTerm
  {
    public static int isNeonNumber(int n)
       {
           int square = n*n;
           int neon = 0;
           while(square > 0)
             {
                int r = square%10;
                neon = neon + r;
                square = square/10;
             }
           if(neon == n)
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
               if(isNeonNumber(i) == 1)
                 {
                    System.out.println(i);
                 }
            }
          obj.close();
       }
  }