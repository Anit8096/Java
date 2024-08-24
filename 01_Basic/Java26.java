// Final class example
final class FinalClass {
    public void display() {
        System.out.println("This is a method in a final class.");
    }
}

// Class with a final method and final variable
class ExampleClass {
    // Final variable
    final int finalVariable = 10;

    // Final method
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    /*
     *  Method trying to modify final variable (uncommenting will cause an error)
     *  public void modifyFinalVariable() {
     *      finalVariable = 20; // This will cause a compilation error
     *  }
     */
}

// Subclass attempting to extend a final class (uncommenting will cause an error)
// class ExtendedFinalClass extends FinalClass { }

// Subclass attempting to override a final method (uncommenting will cause an error)
// class ExtendedExampleClass extends ExampleClass {
//     @Override
//     public void finalMethod() {
//         System.out.println("Trying to override a final method."); // This will cause a compilation error
//     }
// }

public class Java26 {
    public static void main(String[] args) {
        /*
         * final -> this keyword is used to denote constants and to prevent 
         * inheritance and method overriding. It can be applied to
         * variables, methods, and classes, each serving a different purpose.
         */

        
        // Using a final class
        FinalClass finalClassInstance = new FinalClass();
        finalClassInstance.display();

        // Using a class with a final method and variable
        ExampleClass example = new ExampleClass();
        example.finalMethod();

        // Accessing a final variable
        System.out.println("Final variable value: " + example.finalVariable);

    }
}
