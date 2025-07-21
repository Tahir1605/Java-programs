class NumberPattern16
  {
    public static void main(String[] args)
        {
            int n = 5;
            for(int i = 1; i <= n; i++)
                 {
                    int p = 5;
                    for(int j = 1; j <= i; j++)
                        {
                           System.out.print(p+" ");
                           p-=1;
                        }
                    System.out.println();
                 }
        }
  }

  /* Output:
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/
