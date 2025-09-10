import java.util.Scanner;

public class SimpleCharProcessor 
   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = sc.nextLine();

        if (input.length() == 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        int[] freq = new int[256];        // frequency of each character
        int[] firstIndex = new int[256];  // first occurrence index of each character
        for (int i = 0; i < 256; i++) {
            firstIndex[i] = -1;           // initialize firstIndex with -1
        }

        // Count frequency and store first occurrence
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
            if (firstIndex[ch] == -1) {
                firstIndex[ch] = i;
            }
        }

        // Print character frequencies and first occurrences
        boolean[] printed = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!printed[ch]) {
                System.out.println(ch + "->" + freq[ch] + " times, first occurence at index " + firstIndex[ch]);
                printed[ch] = true;
            }
        }

        // Find most repeated character
        int maxFreq = 0;
        char mostRepeated = '\0';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostRepeated = (char) i;
            } else if (freq[i] == maxFreq && firstIndex[i] < firstIndex[mostRepeated]) {
                mostRepeated = (char) i; // Choose one with earlier index in case of tie
            }
        }

        // Find first non-repeating character
        char firstNonRepeat = '\0';
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (freq[ch] == 1) {
                firstNonRepeat = ch;
                break;
            }
        }

        System.out.println("most repeated character : " + mostRepeated + " (appears " + maxFreq + " times)");

        if (firstNonRepeat != '\0') {
            System.out.println("first Non-repeating character : " + firstNonRepeat);
        } else {
            // No non-repeating character found, find first repeating character
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (freq[ch] > 1) {
                    System.out.println("None " + ch);
                    break;
                }
            }
        }

        sc.close();
    }
}
