class NumberPattern14
  {
    public static void main(String[] args)
        {
            int n = 5;
            for(int i = 1; i <= n; i++)
                 {
                    int p = 1;
                    for(int j = 1; j <= i; j++)
                        {
                           System.out.print(p+" ");
                           p+=1;
                        }
                    System.out.println();
                 }
        }
  }

  /* Output:
   1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5
*/