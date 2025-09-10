import java.util.Scanner;
class KthLargestElement
   {
      public static void main(String[] args)
        {
           Scanner obj = new Scanner(System.in);
           int[] a = {5,8,12,7,6,2,4};
           System.out.println("Enter the value of k :" );
           int k = obj.nextInt();
           for(int i = 0; i < a.length-1; i++)
              {
                  for(int j = i+1; j < a.length; j++)
                     {
                           if(a[i] < a[j])
                             {
                                int temp = a[i];
                                a[i] = a[j];
                                a[j] = temp; 
                             }
                     }
                  if(i == k-1)
                     {
                         System.out.println(k+" Largest element is "+a[i]);
                     }
              }
            System.out.println(".......................");
            for(int i = 0; i < a.length; i++)
               {
                   System.out.println(a[i]+"");
               }

            obj.close();
        }
   }