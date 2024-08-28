class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Java32 {
    public static void main(String[] args) {
        // Step 1: Declare and Initialize the Array
        Person[] people = new Person[3]; // Array of Person objects with size 3

        // Step 2: Create Person Objects and Assign Them to the Array
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        people[2] = new Person("Charlie", 35);

        // Accessing and using the objects in the array
        for (Person person : people) {
            person.display();
        }
    }
}
