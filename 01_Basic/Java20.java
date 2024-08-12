import java.util.ArrayList;

public class Java20 {
    public static void main(String[] args) {
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

        // Printing the 2D ArrayList
        System.out.println("Food list by meals:");
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println("Meal " + (i + 1) + ": " + foodList.get(i));
        }

        // Modifying an element in a sub-ArrayList
        foodList.get(1).set(0, "Pizza"); // Changing "Sandwich" to "Pizza" in the lunch list

        System.out.println("\nModified food list:");
        for (ArrayList<String> meal : foodList) {
            System.out.println(meal);
        }

        // Removing an element from a sub-ArrayList
        foodList.get(2).remove("Soup"); // Removing "Soup" from the dinner list
        
        System.out.println("\nFood list after removing Soup from dinner:");
        for (ArrayList<String> meal : foodList) {
            System.out.println(meal);
        }

        // Adding a new meal (sub-ArrayList)
        ArrayList<String> snacks = new ArrayList<>();
        snacks.add("Chips");
        snacks.add("Cookies");
        foodList.add(snacks);

        System.out.println("\nFood list after adding snacks:");
        for (ArrayList<String> meal : foodList) {
            System.out.println(meal);
        }
    }
}
