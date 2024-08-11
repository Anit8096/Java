import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, height, hypotenuse;

        System.out.print("Enter Base of Triangle (in cm): ");
        base = scanner.nextDouble();

        System.out.print("Enter Height of Triangle (in cm): ");
        height = scanner.nextDouble();

        hypotenuse = Math.sqrt((Math.pow(base, 2) + Math.pow(height, 2)));

        System.out.printf("Hypotenuse of Triangle is (in cm): %.2f%n", hypotenuse);
        scanner.close();
    }
}
