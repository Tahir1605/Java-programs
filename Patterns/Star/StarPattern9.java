class StarPattern9 
   {
     public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) 
           {
            for (int j = i; j <= n; j++) 
              {
                 System.out.print(" ");
              }
            for (int j = 1; j <= i; j++) 
              {
                 System.out.print("* ");
              }
            for (int j = i; j <= n - 2; j++) 
              {
                 System.out.print("  ");
              }
            for (int j = 1; j <= i; j++) 
              {
                 if (i == n && j == n) break; 
                 System.out.print("* ");
             } 

            System.out.println();
        }
    }
}

/* output:
     *       *
    * *     * *
   * * *   * * *
  * * * * * * * *
 * * * * * * * * *
*/
