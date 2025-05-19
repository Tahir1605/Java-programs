class FirstDuplicateElement1
  {
    public static void main(String[] args)
      {
         int[] a = {1,2,3,4,5,6,2};
         int temp = 0;
         for(int i = 0; i < a.length-1; i++)
           {
              for(int j = i+1; j < a.length; j++)
                 {
                    if((a[i] == a[j]) && (i!=j))
                      {
                          temp = temp+1;
                          System.out.println("First duplicate element is "+a[i]);
                          break;
                      }
                 }
                 
           }
           if(temp == 0)
             {
                System.out.println("There no duplicate element");
             }
      }
  }