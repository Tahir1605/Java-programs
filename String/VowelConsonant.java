class VowelConsonant 
  {
    public static void main(String[] args) 
     {
        String str = "Hello World";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) 
          {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
               {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                   {
                     vowels++;
                   } 
                 else 
                   {
                    consonants++;
                   }
               }
         }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
     }
 }
