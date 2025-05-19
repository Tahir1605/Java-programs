class CommonElements1
  {
     public static void main(String[] args)
       {
          int[] arr1 = {4,3,7,9,2};
          int[] arr2 = {5,1,4,8,3};
          for(int i = 0; i < arr1.length; i++)
             {
                 for(int j = 0; j < arr2.length; j++)
                    {
                       if(arr1[i] == arr2[j])
                          {
                              System.out.print(arr1[i]+",");
                          }
                    }
             }
       }
  }