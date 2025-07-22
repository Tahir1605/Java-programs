class CharacterPattern14
  {
    public static void main(String[] args) 
       {
        int n = 5;

        for (int i = 1; i <= n; i++) 
          {
            char ch = 'A';
            for (int j = 1; j <= i; j++) 
              {
                System.out.print(ch + " ");
                ch++;
              } 
            System.out.println();
          }
       }
   }   
/* Output:-

A
A B
A B C
A B C D
A B C D E


*/