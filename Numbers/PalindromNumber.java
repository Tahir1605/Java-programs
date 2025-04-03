import java.util.Scanner;
class PalindromNumber
  {
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = obj.nextInt();
         int x = n;
         int s = 0;
         while(n>0)
           {
             int r = n%10;
             s = s*10+r;
             n = n/10;
           }
         if(x == s)
           {
               System.out.println("Palindrom");
           }
         else
           {
               System.out.println("Not Palindrom");
           }
         obj.close();
      }
  }