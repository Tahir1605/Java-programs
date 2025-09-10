import java.util.Scanner;
class ElegibleForVote
  {
     public static void main(String[] args)
       {
          int yrs;
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter your age : ");
          int age = obj.nextInt();
          if(age < 18)
            {
               yrs = 18 - age;
               System.out.println("You have to wait for another "+yrs+" years");
            }
          else
            {
               System.out.println("You are eligible for vote");
            }
         obj.close();
       }
  }