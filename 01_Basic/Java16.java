import java.util.Scanner;

public class Java16 {
    public static void main(String[] args) {
        // Declaring and initializing an array with specific values
        int[] numbers = {1, 2, 3, 4, 5};

        // Declaring an array and initializing with a specific size
        String[] fruits = new String[3];

        // Assigning values to the array
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        // Printing the elements of the numbers array
        System.out.println("Elements of the array \"numbers\":");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Printing the elements of the fruits array using an enhanced for loop
        System.out.println("\nElements of the fruits array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Modifying elements in the numbers array
        numbers[2] = 99;
        System.out.println("\nModified numbers array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Taking user input to fill an array
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of elements you want in the array: ");
        int size = scanner.nextInt();
        int[] userArray = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            userArray[i] = scanner.nextInt();
        }

        // Printing the elements of the user-defined array
        System.out.println("\nElements of the user-defined array:");
        for (int element : userArray) {
            System.out.print(element + "\t");
        }

        scanner.close();
    }
}
