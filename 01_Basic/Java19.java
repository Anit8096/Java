import java.util.ArrayList;

public class Java19 {
    public static void main(String[] args) {

        /*
         * ArrayList is a resizable array. In an arraylist elements 
         * can be added or removed after compilation phase.
         * 
         * Stores reference data types
         */

        // Declare and initialize the ArrayList
        ArrayList<String> food = new ArrayList<>();

        // Adding elements to the ArrayList
        food.add("Pizza");
        food.add("Burger");
        food.add("Pasta");
        food.add("Sushi");

        // Accessing elements in the ArrayList
        System.out.println();
        System.out.println("First food item @index(0): " + food.get(0));
        System.out.println("Second food item @index(1): " + food.get(1));
        System.out.println("Third food item @index(2): " + food.get(2));
        System.out.println("Forth food item @index(3): " + food.get(3));

        // Iterating through the ArrayList using a for-each loop
        System.out.println("\nAll food items:");

        for (String item : food) {
            System.out.print(item + "\t");
        }

        System.out.println("\n\nAll food items:");
        for(int i = 0; i<food.size(); i++) {
            System.out.print(food.get(i) + "\t");
        }

        // Modifying an element in the ArrayList
        food.set(1, "Salad");

        System.out.println("\n\nModified food list:");
        for (String item : food) {
            System.out.print(item + "\t");
        }

        // Removing an element from the ArrayList
        food.remove("Pasta");

        System.out.println("\n\nFood list after removing Pasta:");
        for (String item : food) {
            System.out.print(item + "\t");
        }

        // Checking the size of the ArrayList
        System.out.println("\n\nNumber of food items: " + food.size());

        food.clear();
    }
}
