import java.util.Scanner;;

public class Java12 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        String Name = "";

        while (Name.isBlank()) {
            System.out.print("Enter Your Name: ");
            Name = inpt.nextLine();
        }
        System.out.println("Welcome " + Name + "!!");
        inpt.close();
    }
}
