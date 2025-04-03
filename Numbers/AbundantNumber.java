import java.util.Scanner;
class AbundantNumber
  {
     public static void main(String[] args)
        {
           Scanner obj = new Scanner(System.in);
           System.out.println("Enter a number : ");
           int num = obj.nextInt();
           int sum = 0;
           for(int i = 1; i < num; i++)
             {
                if(num%i == 0)
                  {
                     sum = sum+i;
                  }
             }
            if(sum>num)
             {
                System.out.println("Abundant Number");
             }
            else
             { 
                 System.out.println("Not Abundant Number");
             }
           obj.close();
        }
  }