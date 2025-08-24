import java.util.Scanner;
class SwitchCase
  {
     public static void main(String[] args)
       {
          Scanner sc = new Scanner(System.in);
          int choice;
          while(true)
            {
               System.out.println("----------Menu-----------");
               System.out.println("1.Monday");
               System.out.println("2.Tuesday");
               System.out.println("3.Wednesday");
               System.out.println("4.Exit");
               System.out.println("Enter your choice ...");
               choice = sc.nextInt();
               switch(choice)
                 {
                    case 1:
                         System.out.println("You choose : Monday");
                         break;
                    case 2:
                         System.out.println("You choose : Tuesday");
                         break;
                    case 3:
                         System.out.println("You choose : Wednesday");
                         break;
                    case 4:
                         System.out.println("Exit.....");
                         sc.close();
                         return;
                    default:
                         System.out.println("Wrong choice");
                 }
           }
       }
  }