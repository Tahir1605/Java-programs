import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args){
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a number ");
         int n = obj.nextInt();
         int f = 0;
         for(int i = 1; i <= n; i++){
            if(n%i == 0){
                f = f+1;
            }
         }
         if(f == 2){
            System.out.println("Prime");
         }
         else{
            System.out.println("Not Prime");
         }
         obj.close();
    }
}