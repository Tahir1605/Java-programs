class NumberPattern9
  {
     public static void main(String[] args)
       {
          int n = 5;
          int p = 5;
          for(int i = 1; i <= n; i++)
             {
                for(int j = 1; j < i; j++)
                   {
                      System.out.print("  ");
                   }
                for(int j = i; j <= n; j++)
                   {
                      System.out.print(p+" ");
                   }
                for(int j = i; j <= n-1; j++)
                   {
                      System.out.print(p+" ");
                   }
                p-=1;
                System.out.println();
             }
       }
  }

/* Output:
5 5 5 5 5 5 5 5 5
  4 4 4 4 4 4 4
    3 3 3 3 3
      2 2 2
        1
*/