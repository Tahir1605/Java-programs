// Convert a string to lowercase 

class LowerCase 
  {
    public static void main(String[] args) 
      {
        String str = "HeLLo";
        String result = "";

        for (int i = 0; i < str.length(); i++) 
          {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') 
               {
                result += (char)(ch + 32);
               } 
            else
               {
                result += ch;
               }
          }

        System.out.println("Lowercase: " + result);
      }
  }
