import java.util.Scanner;;

public class Java12 {
    public static void main(String[] args) {
        /*
         * While loop executes a block of code until it's condition remains true
         */
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
