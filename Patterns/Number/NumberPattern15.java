class NumberPattern15
  {
    public static void main(String[] args)
        {
            int n = 5;
            for(int i = 1; i <= n; i++)
                 {
                    int p = 1;
                    for(int j = i; j <= n; j++)
                        {
                           System.out.print(" ");
                        }
                    for(int j = 1; j <= i; j++)
                        {
                           System.out.print(p+" ");
                           p+=1;
                        }
                    for(int j = 1; j < i; j++)
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
    1 2 3
   1 2 3 4 5
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8 9
  */