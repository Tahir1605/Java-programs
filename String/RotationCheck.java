//Check if two strings are rotations of each other

class RotationCheck 
  {
    public static void main(String[] args) 
      {
        String str1 = "abcde";
        String str2 = "deabc";

        if (str1.length() != str2.length()) 
          {
            System.out.println("Not Rotations");
            return;
          }

        String combined = str1 + str1;
        boolean isRotation = false;

        for (int i = 0; i <= combined.length() - str2.length(); i++) 
          {
            int j;
            for (j = 0; j < str2.length(); j++) 
              {
                if (combined.charAt(i + j) != str2.charAt(j)) 
                  {
                    break;
                  }
              }
            if (j == str2.length()) 
              {
                isRotation = true;
                break;
              }
          }

        if (isRotation)
          {
            System.out.println("Strings are rotations.");
          }
        else
          {
            System.out.println("Not Rotations.");
          }
    }
}
