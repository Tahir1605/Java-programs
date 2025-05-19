class InsertElementInArray
   {
      public static void main(String[] args)
        {
           int[] a = {10,20,30,40,50};
           int index_pos = 3;
           int element = 100;
           for(int i = a.length-1; i > index_pos; i--)
              {
                 a[i] = a[i-1];
              }
           a[index_pos] = element;
           for(int i = 0; i < a.length; i++)
              {
                 System.out.print(a[i]+" ");
              }
        }
   }