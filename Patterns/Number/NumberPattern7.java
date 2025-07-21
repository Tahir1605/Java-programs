class NumberPattern7
  {
     public static void main(String[] args)
        {
           int n = 5;
           int p = 5;
           for(int i = 1; i <= n; i++)
              {
                 for(int j = 1; j <= i; j++)
                    {
                        System.out.print(" ");
                    }
                 for(int j = i; j <= n; j++)
                    {
                        System.out.print(p);
                    }
                 p-=1;
                  System.out.println();
              }
        }
  }

/* Output:
   55555
    4444
     333
      22
       1
*/