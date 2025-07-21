import java.util.Scanner;

class PalindromString
  {
     public static void main(String[] args)
       {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a string : ");
          String str = sc.nextLine();
          String reversed = "";
          for(int i = str.length()-1; i >= 0; i--)
             {
                reversed+=str.charAt(i);
             }
          if(str.equals(reversed))
            {
                System.out.println("Palindrom");
            }
          else
            {
                System.out.println("Not Palindrom");
            }
          sc.close();
       }
  }