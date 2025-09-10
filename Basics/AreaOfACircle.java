import java.util.Scanner;
class AreaOfACircle
  {
    public static void main(String[] args)
      {
         double area,circamfarence;
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the radius : ");
         double radius = obj.nextDouble();
         area = 3.14*radius*radius;
         circamfarence = 2*3.14*radius;
         System.out.println("Area of a circular is "+area+" and circamfarence is "+circamfarence);
         obj.close();
      }
  }