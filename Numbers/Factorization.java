import java.util.Scanner;

class Factorization 
   {
      public static void main(String[] args) 
        {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter a number: ");
          int num = sc.nextInt();

           System.out.print(num + " -> ");

     
        for (int i = 2; i <= num; i++) 
          {
             while (num % i == 0) 
               {
                  System.out.print(i);
                  num = num / i;
                  if (num > 1)
                    {
                      System.out.print(" * ");
                    }
            }     
        }

        sc.close();
    }
}
