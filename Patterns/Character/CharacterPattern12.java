class CharacterPattern12
  {
    public static void main(String[] args) 
       {
        int n = 5;

        for (int i = 1; i <= n; i++) 
          {
            for (int j = 1; j <= i; j++) 
              {
                if(i%2 == 0)
                  {
                     System.out.print("B ");
                  }
                else
                  {
                     System.out.print("A ");
                  }
              }
            System.out.println();
          }
       }
   }   

/* Output:-

A
B B
A A A
B B B B
A A A A A


*/
