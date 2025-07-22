class FirstNonRepeated 
  {
    public static void main(String[] args) 
      {
        String str = "swiss";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) 
          {
            int count = 0;

            for (int j = 0; j < str.length(); j++) 
               {
                if (str.charAt(i) == str.charAt(j) && i != j) 
                  {
                    count++;
                  }
               }

            if (count == 0) 
              {
                System.out.println("First non-repeated: " + str.charAt(i));
                found = true;
                break;
              }
          }

        if (!found)
          {
            System.out.println("No non-repeated character found");
          }
    }
}
