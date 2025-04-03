import java.util.Scanner;
class AutomorphicNumberTerm
 {
   public static boolean isAutomorphic(int n)
     {
         int square = n * n;
         int remSquare = 0;
         int remNum = 0;
         while(n>0)
          {
             remSquare = square%10;
             remNum = n%10;
             square = square/10;
             n = n/10;
          }
         if(remSquare == remNum)
          {
             return true;
          }
         else
          {
             return false;
          }
     }
   public static void main(String[] args)
     {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = obj.nextInt();
        for(int i = 1; i <= num; i++)
          {
             if(isAutomorphic(i))
               {
                  System.out.println(i);
               }
          }
        obj.close();
     }
 }