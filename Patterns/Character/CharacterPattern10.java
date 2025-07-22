class CharacterPattern10
  {
    public static void main(String[] args) 
       {
        int n = 5;
        char ch = 'E';

        for (int i = 1; i <= n; i++) 
          {
            for (int j = 1; j <= i; j++) 
              {
                System.out.print(ch + " ");
              }
            ch--; 
            System.out.println();
          }
       }
   } 
   
/* Output:-

E
D D
C C C
B B B B
A A A A A


*/
