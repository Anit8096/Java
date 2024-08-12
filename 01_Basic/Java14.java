import java.util.Scanner;

public class Java14 {
    public static void main(String[] args) {
        /*
         * A For Loop executes a block of code a limited amount of time.
         */

        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter of number of iterations: ");
        int n = inpt.nextInt();

        // Example of a standard for loop
        System.out.println("Standard for loop:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Iteration " + i);
        }

        // Example of an enhanced for loop (for-each loop)
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("\nEnhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        inpt.close();
    }
}
