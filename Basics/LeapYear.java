import java.util.Scanner;
class LeapYear
  {
     public static void main(String[] args)
       {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the year : ");
         int year = obj.nextInt();
         if((year%4 == 0 && year%100 != 0) || year%400 == 0)
            {
               System.out.println("This year is leap year");
            }
         else
            {
               System.out.println("This year is not leap year");
            }

         obj.close();
       }
  }