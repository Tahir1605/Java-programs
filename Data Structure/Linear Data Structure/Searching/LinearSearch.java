import java.util.Scanner;
class LinearSearch
    {
        public static void main(String[] args)
            {
                Scanner obj = new Scanner(System.in);
                int[] a = {10,20,30,40,50,60};
                System.out.println("Enter a number : ");
                int x = obj.nextInt();
                int f = 0;
                for(int i = 0; i < a.length; i++)
                   {
                        if(a[i] == x)
                           {
                                System.out.println("The element in the position"+" "+(i+1));
                                f++;
                                break;
                           }
                   }
                if(f == 0)
                  {
                       System.out.println("No element fount");
                  }

             }
           
    }