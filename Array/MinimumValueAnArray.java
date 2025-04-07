class MinimumValueAnArray
  {
    public static void main(String[] args)
      {
         int[] arr = {80,40,60,70,10,90,78};
         int min = arr[0];
         for(int i = 1; i < arr.length; i++)
            {
               if(arr[i] < min)
                 {
                    min = arr[i];
                 }
            }
         System.out.println("Minimum value in the Array is "+min);
      }
  }