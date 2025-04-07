class SecondSmallestElementInAnArray
  {
    public static void main(String[] args)
     {
        int[] a = {10,20,30,40,50,60,70};
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++)
          {
            if(a[i] < smallest)
              {
                 second_smallest = smallest;
                 smallest = a[i];
              }
            else if(a[i] < second_smallest && a[i]!=smallest)
              {
                  second_smallest = a[i];
              }
          }
        if(second_smallest == Integer.MAX_VALUE)
           {
              System.out.println("No second largest value exists");
           }
        else
           {
              System.out.println("Second Smallest = "+second_smallest);
           }
     }
  }