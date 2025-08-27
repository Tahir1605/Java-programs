class CharacterPattern18 
  {
     public static void main(String[] args)
       {
          int n = 5;

        for (int i = 1; i <= n; i++) 
          {
            char ch = 'A';
            char ch1 = 'A';
            for (int j = 1; j <= i; j++) 
              {
                System.out.print(ch);
                ch++;
              } 
             for(int j = i; j <= 4; j++)
              {
                 System.out.print(" ");
              }
            for(int j = i; j <= 4; j++)
              {
                 System.out.print(" ");
              }
             for (int j = 1; j <= i; j++) 
              {
                System.out.print(ch1);
                ch1++;
              } 
            System.out.println();
          }
        for (int i = 1; i <= n; i++) 
          {
            char ch = 'A';
            char ch1 = 'A';
            for (int j = i; j <= 4; j++) 
              {
                System.out.print(ch);
                ch++;
              } 
             for(int j = 1; j <= i; j++)
               {
                 System.out.print(" ");
               }
              for(int j = 1; j <= i; j++)
               {
                 System.out.print(" ");
               }
             for (int j = i; j <= 4; j++) 
              {
                System.out.print(ch1);
                ch1++;
              } 
            System.out.println();
          }
       } 
  }

/*
Output : -

A        A
AB      AB
ABC    ABC
ABCD  ABCD
ABCDEABCDE
ABCD  ABCD
ABC    ABC
AB      AB
A        A


*/