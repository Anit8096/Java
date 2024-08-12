import java.util.Scanner;

public class Java10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1 to 7) to get the corresponding day of the week: ");
        int dayNumber = scanner.nextInt();
        String dayOfWeek;

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }

        System.out.println("The day of the week is: " + dayOfWeek);
        
        scanner.close();
    }
}
