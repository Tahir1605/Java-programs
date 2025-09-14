import java.util.Scanner;
class Lcm
  {
     static int lcm(int a , int b)
       {
         if(b == 0)
           {
             return a;
           }
         return lcm(b , a%b);
       }
     public static void main(String[] args)
       {
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter the first number : ");
         int first = obj.nextInt();
         System.out.print("Enter the second number : ");
         int second = obj.nextInt();
         int result = (first*second)/lcm(first , second);
         System.out.println(result);
         obj.close();
       }
  }