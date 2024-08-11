import java.util.Scanner;

public class Java09 {
    public static void main(String[] args) {
        Scanner Inpt = new Scanner(System.in);

        System.out.print("Enter your age (in year's): ");
        int age = Inpt.nextInt();

        if (age >= 18) {
            System.out.println("you are an adult.");
        } else if (age > 55) {
            System.out.println("you are too old.");
        } else {
            System.out.println("you are young.");
        }
    }
}
