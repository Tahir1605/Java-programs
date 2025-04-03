import java.util.Scanner;
class SpecialNumber
  {
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter a number : ");
          int n = obj.nextInt();
          int sum = 0;
          int mul = 1;
          int mainSum = 0;
          int num = n;
          while(n>0)
           {
             int r = n%10;
             sum = sum + r;
             mul = mul * r;
             n = n/10;
           }
          mainSum = sum + mul;
          if(mainSum == num)
            {
                System.out.println("Special");
            }    
          else
            {
                System.out.println("Not Special");
            }
          obj.close();
       }
  }