class CharacterPattern6
  {
    public static void main(String[] args) 
       {
        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) 
          {
            for (int j = 1; j <= i; j++) 
              {
                System.out.print(ch + " ");
              }
            ch++; 
            System.out.println();
          }
       }
   }   


/* Output:-

A
B B
C C C
D D D D
E E E E E

 */