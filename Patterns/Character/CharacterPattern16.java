class CharacterPattern16 
  {
    public static void main(String[] args)
      {
         for(int i = 1; i <= 5; i++)
           {
             char ch = 'A';
             for(int j = i; j <= 5; j++)
               {
                  System.out.print(" ");
               }
             for(int j = 1; j <= i; j++)
               {
                  System.out.print(ch);
                  ch++;
               }
             for(int j = 2; j <= i; j++)
               {
                  System.out.print(ch);
                  ch++;
               }
            System.out.println();  
           }
      }
 }

 /*
 Output :- 
     A
    ABC
   ABCDE
  ABCDEFG
 ABCDEFGHI
  */
