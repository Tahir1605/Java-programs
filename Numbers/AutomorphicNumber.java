import java.util.Scanner;
class AutomorphicNumber
  {
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int num = obj.nextInt();
         int square = num*num;
         int squareRem = 0;
         int numRem = 0;
         while(num > 0)
          {
            numRem = numRem%10;
            num = num / 10;
            squareRem = squareRem%10;
            square = square / 10; 
          }
        
         if(numRem == squareRem)
           {
              System.out.println("true");
           }
         else
           {
              System.out.println("false");
           }
         obj.close();
      }
  }