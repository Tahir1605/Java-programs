import java.util.Scanner;

class TotalWordsInString
  {
     public static void main(String[] args)
       {
          int f = 1;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a String : ");
          String str = sc.nextLine();
          for(int i = 0; i < str.length(); i++)
             {
                 if(str.charAt(i) == ' ')
                   {
                      f+=1;
                   }
             }
           System.out.print("Total words = "+f);
           sc.close();
       }
  }