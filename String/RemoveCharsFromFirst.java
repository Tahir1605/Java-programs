class RemoveCharsFromFirst 
   {
    public static void main(String[] args) 
      {
        String str1 = "computer";
        String str2 = "core";
        String result = "";

        for (int i = 0; i < str1.length(); i++) 
          {
            boolean found = false;
            for (int j = 0; j < str2.length(); j++) 
              {
                if (str1.charAt(i) == str2.charAt(j)) 
                  {
                    found = true;
                    break;
                  }
              }
            if (!found) 
              {
                result += str1.charAt(i);
              }
           }

        System.out.println("Result: " + result);
     }
}
