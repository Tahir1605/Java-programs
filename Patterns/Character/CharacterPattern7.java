class CharacterPattern7
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
            ch++; 
            System.out.println();
          }
       }
   }   

/* Output:-

 AAAAA
  BBBB
   CCC
    DD
     E

*/