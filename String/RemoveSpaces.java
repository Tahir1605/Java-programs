// Remove all whitespaces from string

class RemoveSpaces 
  {
    public static void main(String[] args) 
      {
        String str = "Hello World Java";
        String noSpace = "";

        for (int i = 0; i < str.length(); i++) 
          {
            if (str.charAt(i) != ' ') 
              {
                noSpace += str.charAt(i);
              }
          } 

        System.out.println("Without spaces: " + noSpace);
      }
  }
  