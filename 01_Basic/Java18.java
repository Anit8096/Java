public class Java18 {
    public static void main(String[] args) {
        String original = "  Hello, World!  ";

        // Length of the string
        System.out.println("Length of the string: " + original.length());

        // Checks string for equal characters
        System.out.println("Result for equal strings: " + original.equalsIgnoreCase("Anit"));

        // Character at a specific index
        System.out.println("Character at index 7: " + original.charAt(7));

        // Substring from index 2 to 8
        System.out.println("Substring from index 2 to 8: " + original.substring(2, 8));

        // Index of the first occurrence of "World"
        System.out.println("Index of 'World': " + original.indexOf("World"));

        // Convert to uppercase
        System.out.println("Uppercase: " + original.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + original.toLowerCase());

        // Replace 'l' with 'x'
        System.out.println("Replace 'l' with 'x': " + original.replace('l', 'x'));

        // Trim leading and trailing whitespace
        System.out.println("Trimmed string: '" + original.trim() + "'");

        // Split the string by comma and space
        String[] parts = original.split(", ");
        System.out.println("Split by ', ':");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}