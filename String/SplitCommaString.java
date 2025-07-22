class SplitCommaString 
   {
    public static void main(String[] args) 
      {
        String str = "apple,banana,grape,kiwi";
        String word = "";

        for (int i = 0; i < str.length(); i++) 
          {
            if (str.charAt(i) != ',') 
              {
                word += str.charAt(i);
              } 
            else 
              {
                System.out.println(word);
                word = "";
               }
          }

        if (!word.equals("")) 
         {
            System.out.println(word); 
         }
     }
 }
