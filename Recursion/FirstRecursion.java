class FirstRecursion{
   public static int printNumber(int n){
      if(n>5){
         return 0;
      }
      System.out.println(n);
      return printNumber(n+1);
   }
   public static void main(String[] args){
      int n = 1;
      printNumber(n);
   }
}