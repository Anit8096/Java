import java.util.Random;

public class Java08 {
    public static void main(String[] args) {
        Random random = new Random();

        // Generating a random integer
        int randomInt = random.nextInt();
        System.out.println("Random integer: " + randomInt);

        // Generating a random double
        double randomDouble = random.nextDouble();
        System.out.println("Random double: " + randomDouble);

        // Generating a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);

        // Generating a random float
        float randomFloat = random.nextFloat();
        System.out.println("Random float: " + randomFloat);

        // Generating a random long
        long randomLong = random.nextLong();
        System.out.println("Random long: " + randomLong);

        // Generating a random integer within a specific range (0 to 99)
        int randomIntRange = random.nextInt(100); // Range 0 (inclusive) to 100 (exclusive)
        System.out.println("Random integer in range 0 to 99: " + randomIntRange);

        // Generating a random double within a specific range (0.0 to 1.0)
        double randomDoubleRange = 0.5 + (random.nextDouble() * 0.5); // Range 0.5 to 1.0
        System.out.println("Random double in range 0.5 to 1.0: " + randomDoubleRange);

        // Generating a random long within a specific range
        long randomLongRange = 500 + (long) (random.nextDouble() * 1000); // Range 500 to 1499
        System.out.println("Random long in range 500 to 1499: " + randomLongRange);

        // Generating a random Gaussian ("normally distributed") double value with mean 0 and std deviation 1
        double randomGaussian = random.nextGaussian();
        System.out.println("Random Gaussian: " + randomGaussian);
    }
}
