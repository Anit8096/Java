import java.util.Scanner;
public class Java11 {
    public static void main(String[] args) {
        /*
         * logical operators are used to connect two or more expressions
         *      logical operators are as follows :-
         *          && -> AND Operator: both conditions must be true.
         *          || -> OR Operator: either condition must be true.
         *          !  -> NOT Operator: reverses boolean value of conditions.
         */
        Scanner inpt = new Scanner(System.in);

        System.out.print("Enter Temperature (in Degree Celsius)");
        int temp = inpt.nextInt();
        if (temp > 30) {
            System.out.println("it's hot outside.");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("it's warm outside.");
        } else {
            System.out.println("it's cold outside.");
        }

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = inpt.next();

        if(response.equals("q") || response.equals ("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("YOu are still playing the game *pew pew*");
        }

        System.out.println("You are playing a game! Press q or Q to quit");
        String response1 = inpt.next();

        if(!response1.equals("q") && !response1.equals ("Q")) {
            System.out.println("YOu are still playing the game *pew pew*");
        } else {
            System.out.println("You quit the game");
        }

        inpt.close();
    }
}