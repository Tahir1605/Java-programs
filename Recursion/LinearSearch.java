import java.util.Scanner;
class LinearSearch
  {
     static int isFind(int[] arr, int n ,int  a)
       {
          if(n != 0)
            {
                if(arr[n-1] == a)
                  {
                    return n-1;
                  }
                return isFind(arr, n-1, a);
            }
            return -1;
       }
     public static void main(String[] args)
       {
          Scanner obj = new Scanner(System.in);
          System.out.print("Enter the size of array : ");
          int size = obj.nextInt();
          int[] arr = new int[size];
          System.out.println("Enter the array elements : ");
          for(int i = 0; i < size; i++)
            {
              arr[i] = obj.nextInt();
            }
          System.out.print("Enter the Number that you want to search : ");
          int x = obj.nextInt();
          int result = isFind(arr , size , x);
          if(result == -1)
            {
                System.out.println("Element not found");
            }
          else
            {
                System.out.println("Element found at position "+(result+1));
            }
          obj.close();
       }
  }