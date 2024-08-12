import java.util.Scanner;

public class Java13 {
    public static void main(String[] args) {
        /*
         * Do-While loop is a varition of While loop, it ensures to 
         * perform the block of code atleast once.
         */
        Scanner inpt = new Scanner(System.in);
        String Name = "";

        do {
            System.out.print("Enter Your Name: ");
            Name = inpt.nextLine();
        }
        while (Name.isBlank());

        System.out.println("Welcome " + Name + "!!");
        inpt.close();
    }
}
