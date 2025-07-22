class MaxMinChar 
  {
    public static void main(String[] args) 
      {
        String str = "aabbccc";
        int[] count = new int[256]; 

        for (int i = 0; i < str.length(); i++) 
          {
            count[str.charAt(i)]++;
          }

        int max = 0, min = Integer.MAX_VALUE;
        char maxChar = ' ', minChar = ' ';

        for (int i = 0; i < 256; i++) 
          {
            if (count[i] > 0) 
              {
                if (count[i] > max) 
                  {
                    max = count[i];
                    maxChar = (char) i;
                  }
                if (count[i] < min) 
                  {
                    min = count[i];
                    minChar = (char) i;
                  }
              }
          }

        System.out.println("Max occurring: " + maxChar);
        System.out.println("Min occurring: " + minChar);
     }
  } 
