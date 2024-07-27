import java.util.Scanner;

public class Java04 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // String input
        System.out.print("Enter a string: ");
        String stringInput = scanner.nextLine();
        System.out.println("You entered: " + stringInput+"\n");

        // Integer input
        System.out.print("Enter an integer: ");
        int intInput = scanner.nextInt();
        System.out.println("You entered: " + intInput+"\n");

        // Double input
        System.out.print("Enter a double: ");
        double doubleInput = scanner.nextDouble();
        System.out.println("You entered: " + doubleInput+"\n");

        // Character input
        System.out.print("Enter a character: ");
        char charInput = scanner.next().charAt(0);
        System.out.println("You entered: " + charInput+"\n");

        // Boolean input
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanInput = scanner.nextBoolean();
        System.out.println("You entered: " + booleanInput+"\n");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
