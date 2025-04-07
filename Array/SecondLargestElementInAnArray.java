class SecondLargestElementInAnArray
  {
    public static void main(String[] args)
     {
        int[] a = {10,20,30,40,50,60,70};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++)
          {
            if(a[i] > largest)
              {
                 second_largest = largest;
                 largest = a[i];
              }
            else if(a[i] > second_largest && a[i]!=largest)
              {
                  second_largest = a[i];
              }
          }
        if(second_largest == Integer.MIN_VALUE)
           {
              System.out.println("No second largest value exists");
           }
        else
           {
              System.out.println("Second Largest = "+second_largest);
           }
     }
  }