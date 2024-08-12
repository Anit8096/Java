import java.util.Scanner;

public class Java17 {
    public static void main(String[] args) {
        // Declaration and initialization of a 2D array with specific values
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing the elements of the 2D array using nested loops
        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Modifying an element in the 2D array
        matrix[1][1] = 99;
        System.out.println("\nModified 2D array:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Taking user input to fill a 2D array
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] userMatrix = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        // Printing the elements of the user-defined 2D array
        System.out.println("\nElements of the user-defined 2D array:");
        for (int[] row : userMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
