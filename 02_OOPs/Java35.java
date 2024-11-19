public class Java35 {
    public static void main(String[] args) {
        // method overriding = Declaring a method in sub class,
        // which is already present in parent class.
        // done so that a child class can give its own implementation
        Animal a1 = new Animal();
        Dog d1 = new Dog();

        d1.speak();
    }
}

class Animal {
    void speak() {
        System.err.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog goes *Bark*");
    }
}