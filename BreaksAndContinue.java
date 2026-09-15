import java.util.Scanner;

public class BreaksAndContinue {
    public static void main(String[] args) {
        int[] wayasa = new int[10];
        Scanner scanner = new Scanner(System.in);
        int count = 0; // Tracks the number of unique ages added

        while (count < 10) {
            System.out.print("Enter your AGE = ");
            int inputAge = scanner.nextInt();

            boolean isDuplicate = false;

            // Check if input age is already stored in the array
            for (int k = 0; k < count; k++) {
                if (wayasa[k] == inputAge) {
                    isDuplicate = true;
                    break; // Stop checking loop once duplicate is found
                }
            }

            if (isDuplicate) {
                System.out.println("The age is already entered. Try again.");
                continue; // Skip saving and move to next prompt
            }

            // Store unique age and update entry count
            wayasa[count] = inputAge;
            System.out.println("Age saved successfully.");
            count++;
        }

        scanner.close(); // Close Scanner once at the very end
    }
}