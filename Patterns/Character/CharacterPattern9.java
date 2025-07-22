class CharacterPattern9
  {
    public static void main(String[] args) 
       {
        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) 
          {
            for (int j = 1; j <= i; j++) 
              {
                System.out.print(" ");
              }
            for (int j = i; j <= n; j++) 
              {
                System.out.print(ch);
              }
            for (int j = i; j <= n-1; j++) 
              {
                System.out.print(ch);
              }
            ch++; 
            System.out.println();
          }
       }
   }   

/* Output:-

  AAAAAAAAA
   BBBBBBB
    CCCCC
     DDD
      E

*/