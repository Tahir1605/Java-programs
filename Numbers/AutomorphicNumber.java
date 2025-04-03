import java.util.Scanner;
class AutomorphicNumber
  {
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter a number : ");
          int num = obj.nextInt();
          int square = num*num;
          int remNum = 0;
          int remSquare = 0;
          while(num > 0)
            {
              remNum = num%10;
              remSquare = square%10;
              num = num/10;
              square = square/10; 
            }
          if(remNum == remSquare)
            {
              System.out.println("Automorphic Number");
            }
          else
            {
              System.out.println("Not Automorphic Number");
            }
          obj.close();
       }
  }