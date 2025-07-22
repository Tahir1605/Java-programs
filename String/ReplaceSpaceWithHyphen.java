//  Replace all spaces with hyphen (-)

class ReplaceSpaceWithHyphen 
  {
    public static void main(String[] args) 
      {
        String str = "Java is fun";
        String result = "";

        for (int i = 0; i < str.length(); i++)
          {
            if (str.charAt(i) == ' ') 
             {
                result += '-';
             } 
            else 
             {
                result += str.charAt(i);
             }
          }

        System.out.println("Modified string: " + result);
     }
 }
