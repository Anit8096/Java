import java.util.ArrayList;

public class Java21 {
    public static void main(String[] args) {
        /*
         * For-Each loop is a technique to iterate through elements in an array or container
         * its easier to read, less steps required and more reliable
         * its not as flexible as a standard for loop
         */

        // Declare and initialize the 2D ArrayList
        ArrayList<ArrayList<String>> foodList = new ArrayList<>();

        // Add sub-ArrayLists to the main ArrayList
        ArrayList<String> breakfast = new ArrayList<>();
        breakfast.add("Pancakes");
        breakfast.add("Waffles");
        breakfast.add("Omelette");
        foodList.add(breakfast);

        ArrayList<String> lunch = new ArrayList<>();
        lunch.add("Sandwich");
        lunch.add("Burger");
        lunch.add("Salad");
        foodList.add(lunch);

        ArrayList<String> dinner = new ArrayList<>();
        dinner.add("Pasta");
        dinner.add("Steak");
        dinner.add("Soup");
        foodList.add(dinner);

        // Using a for-each loop to iterate through the 2D ArrayList
        System.out.println("Food list by meals:");
        for (ArrayList<String> meal : foodList) {
            System.out.println("Meal: ");
            for (String item : meal) {
                System.out.println(" - " + item);
            }
        }
    }
}
