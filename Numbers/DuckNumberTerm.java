import java.util.Scanner;
class DuckNumberTerm
  {
       public static boolean isDuck(int n)
          {
              String numStr = String.valueOf(n);

          if (numStr.charAt(0) == '0') 
           {
              return false;
           }

        
          return numStr.contains("0");

          }
       public static void main(String[] args)
          {
              Scanner obj = new Scanner(System.in);
              System.out.println("Enter a number : ");
              int num = obj.nextInt();
              for(int i = 1; i <= num; i++)
                 {
                     if(isDuck(i))
                       {
                          System.out.println(i);
                       }
                 }

               obj.close();
          }
  }