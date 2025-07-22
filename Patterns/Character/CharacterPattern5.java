class CharacterPattern5 
   {
    public static void main(String[] args) 
      {
        int n = 5;

        
        for (int i = 1; i <= n; i++) 
           {
            
            for (int j = i; j <= n; j++) 
              {
                System.out.print(" ");
              }

           
            for (int j = 1; j <= i; j++) 
             {
                System.out.print("A");
             }

            
            for (int j = 2; j <= i; j++) 
             {
                System.out.print("A");
             }

            System.out.println();
         }

       
        for (int i = 1; i < n; i++) 
          {
           
            for (int j = 1; j <= i + 1; j++)
             {
                System.out.print(" ");
             }

            
            for (int j = i; j < n; j++) 
             {
                System.out.print("A");
             }

          
            for (int j = i; j < n - 1; j++) 
             {
                System.out.print("A");
             }

            System.out.println();
        }
    }
}

/* Output:-

     A
    AAA
   AAAAA
  AAAAAAA
 AAAAAAAAA
  AAAAAAA
   AAAAA
    AAA
     A

 */
