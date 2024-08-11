public class Java07 {
    public static void main(String[] args) {
        double number1 = -4.7;
        double number2 = 2.5;
        int intNumber = -5;
        double base = 2.0;
        double exponent = 3.0;
        double angle = Math.PI / 4; // 45 degrees in radians

        // Absolute value
        System.out.println("Absolute value of " + number1 + " is: " + Math.abs(number1));
        System.out.println("Absolute value of " + intNumber + " is: " + Math.abs(intNumber));

        // Ceiling and Floor
        System.out.println("Ceiling value of " + number2 + " is: " + Math.ceil(number2));
        System.out.println("Floor value of " + number2 + " is: " + Math.floor(number2));

        // Rounding
        System.out.println("Rounded value of " + number2 + " is: " + Math.round(number2));

        // Trigonometric functions (angle in radians)
        System.out.println("Sine of " + angle + " is: " + Math.sin(angle));
        System.out.println("Cosine of " + angle + " is: " + Math.cos(angle));
        System.out.println("Tangent of " + angle + " is: " + Math.tan(angle));

        // Arc Trigonometric functions (returns angle in radians)
        System.out.println("Arcsine of 0.707 is: " + Math.asin(0.707));
        System.out.println("Arccosine of 0.707 is: " + Math.acos(0.707));
        System.out.println("Arctangent of 1 is: " + Math.atan(1));

        // Hyperbolic functions
        System.out.println("Hyperbolic sine of " + angle + " is: " + Math.sinh(angle));
        System.out.println("Hyperbolic cosine of " + angle + " is: " + Math.cosh(angle));
        System.out.println("Hyperbolic tangent of " + angle + " is: " + Math.tanh(angle));

        // Exponential and Logarithmic
        System.out.println("Exponential of " + exponent + " is: " + Math.exp(exponent));
        System.out.println("Natural logarithm of " + exponent + " is: " + Math.log(exponent));
        System.out.println("Base 10 logarithm of " + exponent + " is: " + Math.log10(exponent));

        // Power and Square root
        System.out.println(base + " raised to the power of " + exponent + " is: " + Math.pow(base, exponent));
        System.out.println("Square root of " + base + " is: " + Math.sqrt(base));

        // Maximum and Minimum
        System.out.println("Maximum of " + number1 + " and " + number2 + " is: " + Math.max(number1, number2));
        System.out.println("Minimum of " + number1 + " and " + number2 + " is: " + Math.min(number1, number2));

        // PI and E constants
        System.out.println("Value of Pi is: " + Math.PI);
        System.out.println("Value of E is: " + Math.E);

        // Random number between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println("Random number: " + Math.random());

        // Copy Sign
        System.out.println("Copy sign of " + number2 + " to " + number1 + " is: " + Math.copySign(number2, number1));

        // Remainder
        System.out.println("Remainder of " + base + " divided by " + number2 + " is: " + Math.IEEEremainder(base, number2));
    }
}
