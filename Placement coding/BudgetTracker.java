import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = 0;
        int totalExpenditure = 0;
        String[] materials = new String[100];
        int[] spent = new int[100];
        int count = 0;

        // Step 1: Take income input
        System.out.print("Income : ");
        income = Integer.parseInt(sc.nextLine());

        // Step 2: Take expenditure inputs
        while (true) {
            System.out.print("Type of material (or 'done' to finish) : ");
            String material = sc.nextLine();

            if (material.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Expenditure : ");
            int amount = Integer.parseInt(sc.nextLine());

            materials[count] = material;
            spent[count] = amount;
            totalExpenditure += amount;
            count++;
        }

        // Step 3: Display output
        int savings = income - totalExpenditure;

        System.out.println("\nTotal Income : " + income);
        System.out.println("Total Expenditure : " + totalExpenditure);
        System.out.println("Total Savings : " + savings);
        System.out.println("Expenditures :");

        for (int i = 0; i < count; i++) {
            System.out.println(materials[i] + " : " + spent[i]);
        }

        sc.close();
    }
}
