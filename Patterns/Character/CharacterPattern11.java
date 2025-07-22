class CharacterPattern11
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
            ch+=2; 
            System.out.println();
          }
       }
   }   
/* Output:-

A
C C
E E E
G G G G
I I I I I


*/