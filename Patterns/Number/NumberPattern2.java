class NumberPattern2
  {
     public static void main(String[] args)
        {
           int n = 5;
           int p = 1;
           for(int i = 1; i <= n; i++)
              {
                 for(int j = 1; j <= i; j++)
                    {
                        System.out.print(p+" ");
                    }
                 p+=1;
                  System.out.println();
              }
        }
  }

 /* Output:
  1 
  2 2 
  3 3 3 
  4 4 4 4 
  5 5 5 5 5
 */