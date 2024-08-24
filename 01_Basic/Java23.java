// Abstract class with an abstract method
abstract class Vehicle {
    public abstract void startEngine(); // Abstract method

    public void stopEngine() { // Instance method
        System.out.println("Engine stopped.");
    }
}

// Subclass implementing the abstract method
class Car extends Vehicle {
    @Override
    public void startEngine() { // Implementation of the abstract method
        System.out.println("Car engine started.");
    }
}

class ExampleClass {
    private int value; // Instance variable

    // Accessor method (getter)
    public int getValue() {
        return value;
    }

    // Mutator method (setter)
    public void setValue(int value) {
        this.value = value;
    }

    // Static method
    public static void displayMessage() {
        System.out.println("Hello from the static method!");
    }

    // Final method
    public final void showFinalMethod() {
        System.out.println("This is a final method and cannot be overridden.");
    }

    // Synchronized method
    public synchronized void synchronizedMethod() {
        System.out.println("This is a synchronized method.");
    }

    // Method with parameters and a return type
    public int addNumbers(int a, int b) {
        return a + b;
    }
}

public class Java23 {
    public static void main(String[] args) {
        // Instance of ExampleClass
        ExampleClass example = new ExampleClass();

        // Using accessor and mutator methods
        example.setValue(100);
        System.out.println("Value: " + example.getValue());

        // Using a static method
        ExampleClass.displayMessage();

        // Using a final method
        example.showFinalMethod();

        // Using a synchronized method
        example.synchronizedMethod();

        // Using a method with parameters and a return type
        int sum = example.addNumbers(10, 20);
        System.out.println("Sum: " + sum);

        // Using an abstract method
        Vehicle myCar = new Car();
        myCar.startEngine();  // Calls the overridden abstract method
        myCar.stopEngine();   // Calls the instance method
    }
}
