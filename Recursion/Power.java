import java.util.Scanner;
public class Power {
    public static int PowerOfTwo(int n){
        if(n == 0){
            return 1;
        }
        return 2*PowerOfTwo(n-1);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = obj.nextInt();
        System.out.println(PowerOfTwo(n));
        obj.close();
    }
}
