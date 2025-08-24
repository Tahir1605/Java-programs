import java.util.Scanner;
class SpyNumber
  {
     public static void main(String[] args)
       {
           int sum = 0;
           int mul = 1;
           Scanner obj = new Scanner(System.in);
           System.out.println("Enter a number : ");
           int num = obj.nextInt();
           while(num > 0)
             {
                int r = num%10;
                sum = sum+r;
                mul = mul*r;
                num = num/10;
             }
           if(sum == mul)
             {
                System.out.println("spy number");
             }
           else
             {
                System.out.println("not spy number");
             }
           obj.close();
       }
  }