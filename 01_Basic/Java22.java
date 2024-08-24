public class Java22 {
    public static void main(String[] args) {
        /*
         * Methods in Java is a block of code that is executed 
         * whenever it's called upon 
         */
        Java22 Obj = new Java22();
        Obj.hello();
        
        helloo();
        
        helo("Anit");
        
        System.out.println(add(19, 56) + "\n");
    }

    //Non static method 
    //requires to create an object in main class beforehand to call this method
    void hello() { 
        System.out.println("\n1. Non-static, Non-parameterized Method \n");
    }

    //Static Non-parameterized method
    //no object is required be created to call this method in main class  
    static void helloo(){
        System.out.println("2. Static Non-parameterized method\n");
    }

    //static parameterized method
    static void helo(String Name) {
        System.out.println("3. Static Parameterized Method");
        System.out.println("Hello " + Name);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
