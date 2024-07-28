public class Java05 {
    
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        // Arithmetic expressions
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Relational expressions
        boolean isEqual = a == b;
        boolean isGreaterThan = a > b;

        // Logical expressions
        boolean andResult = (a > b) && (b > 0);
        boolean orResult = (a > b) || (b < 0);

        // Assignment expressions
        int x = 10;
        x += 5;

        // Conditional expression
        int max = (a > b) ? a : b;

        // Method call expression
        int result = add(a, b);

        // Instanceof expression
        String str = "Hello";
        boolean isString = str instanceof String;

        // Array access expression
        int[] numbers = {1, 2, 3, 4, 5};
        int firstNumber = numbers[0];

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Greater Than: " + isGreaterThan);
        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("Max: " + max);
        System.out.println("Result from method call: " + result);
        System.out.println("Is String: " + isString);
        System.out.println("First number in array: " + firstNumber);
        System.out.println("Increment (+=): " + x);
    }
}
