import java.util.Random;

public class Java29 {
    /**
     * Dice1
     */
    static class Dice1 {
        Random random; // global Variable
        int Number; // global variable

        Dice1() {
            random = new Random();
            roll();
        }

        void roll() {
            Number = random.nextInt(6) + 1;
            System.out.println(Number);
        }
    }

    /**
     * Dice2
     */
    static class Dice2 {
        Dice2() {
            Random rndm = new Random(); // Local Variable
            int number = 0; // Local Variable
            roll(rndm, number);
        }

        void roll(Random Rndm, int num) {
            num = Rndm.nextInt(6) + 1;
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        /*
         * local variable = declared inside a method
         * visible to that method only
         * 
         * global variable = declared outside a method, but within a class
         * visible to all parts of the class
         */
        // Dice1 d1 = new Dice1();
        // Dice2 D2 = new Dice2();
    }
}
