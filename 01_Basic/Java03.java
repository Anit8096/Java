import java.util.Scanner;

public class Java03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.err.println("whats your name ?");
        String Name = scanner.nextLine();
        
        System.err.println("How old are you ?");
        int Age = scanner.nextInt();
        scanner.nextLine();
        
        System.err.println("whats your favorite food ?");
        String Food = scanner.nextLine();

        System.out.println("Hello "+Name);
        System.out.println("You are "+Age+" years old.");
        System.out.println("You like "+Food);

        scanner.close();
    }
}
