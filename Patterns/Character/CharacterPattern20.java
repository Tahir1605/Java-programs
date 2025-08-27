class CharacterPattern19
  {
     public static void main(String[] args)
       {  
          for(int i = 1; i <= 5; i++)
             {
                char ch = 'E';
                for(int j = 1; j <= i; j++)
                   {
                      System.out.print(" ");
                   }
                for(int j = i; j <= 5; j++)
                   {
                      System.out.print(ch);
                      ch-=1;
                   }
                System.out.println();
             }
       }
  }

  /*
 EDCBA
  EDCB
   EDC
    ED
     E
   */