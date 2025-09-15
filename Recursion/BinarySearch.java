import java.util.Scanner;
class BinarySearch
  {
    static int isSearched(int[] arr,int e , int beg , int end)
      {
          if(beg <= end)
            {
                int mid = beg + (end-beg)/2;
                if(arr[mid] == e)
                  {
                    return mid;
                  }
                else if(arr[mid] <= e)
                  {
                    return isSearched(arr, e, mid+1, end);
                  }
                else
                  {
                    return isSearched(arr, e, beg, mid-1);
                  }
            }
            return -1;
      }
    public static void main(String[] args)
      {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of n : ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element : ");
        for(int i = 0; i < size; i++)
          {
            arr[i] = obj.nextInt();
          }
        System.out.print("Enter the element that you want to search : ");
        int x = obj.nextInt();
        int beg = 0;
        int end = size-1;
        int result = isSearched(arr , x , beg , end);
        if(result == -1)
          {
            System.out.print("The element is not found");
          }
        else
          {
            System.out.print("The element is found in position "+ (result+1));
          }
        obj.close();
      }
  }