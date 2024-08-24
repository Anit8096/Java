public class Java24 {
    // Overloaded method with no parameters
    public int add() {
        return 0; // Default value
    }

    // Overloaded method with one integer parameter
    public int add(int a) {
        return a; // Returns the same number
    }

    // Overloaded method with two integer parameters
    public int add(int a, int b) {
        return a + b; // Returns the sum of two numbers
    }

    // Overloaded method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c; // Returns the sum of three numbers
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b; // Returns the sum of two doubles
    }

    public static void main(String[] args) {
        Java24 calc = new Java24();

        // Calling overloaded methods
        System.out.println("Sum with no parameters: " + calc.add());
        System.out.println("Sum with one parameter: " + calc.add(10));
        System.out.println("Sum with two parameters: " + calc.add(10, 20));
        System.out.println("Sum with three parameters: " + calc.add(10, 20, 30));
        System.out.println("Sum with double parameters: " + calc.add(10.5, 20.5));
    }

}
