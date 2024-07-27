public class Java02 {
    public static void main(String[] args) {
        // Primitive data types
        boolean booleanVar = true;  // Size: 1-bit (but JVM uses 8 bits for boolean)
        byte byteVar = 1;           // Size: 8-bit, Range: -128 to 127
        char charVar = 'A';         // Size: 16-bit, Range: 0 to 65,535 (Unicode)
        short shortVar = 2;         // Size: 16-bit, Range: -32,768 to 32,767
        float floatVar = 5.0f;      // Size: 32-bit, Range: ~1.4E-45 to ~3.4E+38
        int intVar = 3;             // Size: 32-bit, Range: -2^31 to 2^31-1 (i.e., -2,147,483,648 to 2,147,483,647)
        long longVar = 4L;          // Size: 64-bit, Range: -2^63 to 2^63-1 (i.e., -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        double doubleVar = 6.0;     // Size: 64-bit, Range: ~4.9E-324 to ~1.8E+308

        // Reference data types
        String stringVar = "Hello"; // Size: Depends on the length of the string and JVM implementation
        Integer integerVar = 10;    // Wrapper class for int
        Double doubleObjVar = 20.0; // Wrapper class for double

        // Printing values and their types
        System.out.println("Primitive Data Types:");
        System.out.println("boolean: " + booleanVar + " (Size: 1-bit)");
        System.out.println("byte: " + byteVar + " (Size: 8-bit, Range: -128 to 127)");
        System.out.println("char: " + charVar + " (Size: 16-bit, Range: 0 to 65,535)");
        System.out.println("short: " + shortVar + " (Size: 16-bit, Range: -32,768 to 32,767)");
        System.out.println("int: " + intVar + " (Size: 32-bit, Range: -2,147,483,648 to 2,147,483,647)");
        System.out.println("float: " + floatVar + " (Size: 32-bit, Range: ~1.4E-45 to ~3.4E+38)");
        System.out.println("long: " + longVar + " (Size: 64-bit, Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)");
        System.out.println("double: " + doubleVar + " (Size: 64-bit, Range: ~4.9E-324 to ~1.8E+308)");

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + stringVar + " (Size: Depends on the length of the string and JVM implementation)");
        System.out.println("Integer: " + integerVar + " (Wrapper class for int)");
        System.out.println("Double: " + doubleObjVar + " (Wrapper class for double)");
    }
}
