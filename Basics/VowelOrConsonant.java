import java.util.Scanner;
class VowelOrConsonant
  {
    public static void main(String[] args)
      {
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter a Character : ");
          char item = obj.next().charAt(0);
          if(item == 'a' || item == 'e' || item == 'i' || item == 'o' || item == 'u' || item == 'A' || item == 'E' || item == 'I' || item == 'O' || item == 'U')
            {
               System.out.println("It is a Vowel");
            }
          else
            {
               System.out.println("It is a Consonant");
            }
      }
  }