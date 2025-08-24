import java.util.Scanner;
class NeonNumber
  {
     public static void main(String[] args)
       {
           Scanner obj = new Scanner(System.in);
           System.out.println("enter a number : ");
           int num = obj.nextInt();
           int square = num*num;
           int neon = 0;
           while(square > 0)
              {
                 int r = square%10;
                 neon = neon + r;
                 square = square/10;
              }
           if(neon == num)
              {
                 System.out.println("neon number");
              }
           else
              {
                 System.out.println("not neon number");
              }
           obj.close();
       }
  }