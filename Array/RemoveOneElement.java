import java.util.Scanner;
class RemoveOneElement
  {
      public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            int[] a = {10,40,30,80,60,20};
            System.out.println("Enter a number that you want to delete : ");
            int del_ele = obj.nextInt();
            int count = 0;
            for(int i = 0; i < a.length; i++)
               {
                   if(del_ele == a[i])
                     {
                         for(int j = i; j < a.length-1; j++)
                            {
                                 a[j] = a[j+1];
                            }
                          count = count+1;
                          break;
                     }
               }
             if(count == 0)
               {
                  System.out.println("Element not found");
               }
             else
               {
                  System.out.println("Element deleted successfully");
               }
             for(int i = 0; i < a.length; i++)
                {
                   System.out.print(a[i]+" ");
                }
        }
  }