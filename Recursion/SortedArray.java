import java.util.Scanner;
class SortedArray
  {
    static boolean isSorted(int[] arr, int n)
      {
         if(n == 0 || n == 1)
           {
              return true;
           }
         return arr[n-1] >= arr[n-2] && isSorted(arr, n-1);
      }
    public static void main(String[] args)
      {
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter the array size : ");
         int s = obj.nextInt();
         int[] arr = new int[s];
         System.out.println("Enter the array elements : ");
         for(int i = 0; i < s; i++)
            {
                arr[i] = obj.nextInt();
            }
         if(isSorted(arr , s))
           {
             System.out.println("Array is sorted");
           }
        else
           {
             System.out.println("Array is not sorted");
           }
         
         obj.close();
      }
  }