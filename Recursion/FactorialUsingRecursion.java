import java.util.Scanner;
class FactorialUsingRecursion {
    public static long Factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = obj.nextInt();
        long fact = Factorial(n);
        System.out.println("Factorial of "+ n +" is "+fact);
        obj.close();
    }
}
