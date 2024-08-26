class Car {
    String model;
    int year;
    String color;

    // Default constructor
    Car() {
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
    }

    // Constructor with one parameter
    Car(String model) {
        this.model = model;
        this.year = 0;
        this.color = "Unknown";
    }

    // Constructor with two parameters
    Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Unknown";
    }

    // Constructor with three parameters
    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class Java30 {
    public static void main(String[] args) {
        // Using different constructors
        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda", 2021);
        Car car4 = new Car("Ford", 2022, "Blue");

        // Displaying information of cars
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
        car4.displayInfo();
    }
}
