class Permutations 
   {
    static void permute(char[] arr, int l, int r) 
      {
        if (l == r) 
          {
            for (int i = 0; i <= r; i++)
              {
                System.out.print(arr[i]);
              }
            System.out.println();
          } 
        else 
          {
            for (int i = l; i <= r; i++) 
              {
                char temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;

                permute(arr, l + 1, r);

               
                temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        char[] arr = str.toCharArray();
        permute(arr, 0, arr.length - 1);
    }
}
