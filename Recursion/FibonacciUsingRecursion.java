import java.util.Scanner;
public class FibonacciUsingRecursion {
    public static int Fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
         
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Term : ");
        int n = obj.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println(Fibonacci(i));
        }
        obj.close();
    }
}
