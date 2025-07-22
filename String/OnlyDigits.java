// Check if a string contains only digits


class OnlyDigits 
  {
    public static void main(String[] args) 
      {
        String str = "12345";
        boolean allDigits = true;

        for (int i = 0; i < str.length(); i++) 
          {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) 
              {
                allDigits = false;
                break;
              }
          }
   
        if (allDigits)
          {
            System.out.println("Contains only digits");
          }
        else
          {
            System.out.println("Contains other characters");
          }
      }
  }
