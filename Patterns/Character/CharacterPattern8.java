class CharacterPattern8
  {
    public static void main(String[] args) 
       {
        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) 
          {
            for (int j = i; j <= n; j++) 
              {
                System.out.print(" ");
              }
            for (int j = 1; j <= i; j++) 
              {
                System.out.print(ch);
              }
            for (int j = 2; j <= i; j++) 
              {
                System.out.print(ch);
              }
            ch++; 
            System.out.println();
          }
       }
   }  
   
   
/* Output:-

     A
    BBB
   CCCCC
  DDDDDDD
 EEEEEEEEE

*/