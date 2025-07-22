class RemoveChar 
  {
    public static void main(String[] args) 
      {
        String str = "banana";
        char toRemove = 'a';
        String result = "";

        for (int i = 0; i < str.length(); i++) 
          {
            if (str.charAt(i) != toRemove) 
              {
                result += str.charAt(i);
              }
          }

        System.out.println("After removal: " + result);
      }
  }
