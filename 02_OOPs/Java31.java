public class Java31 {
    public static void main(String[] args) {
        /*
         * toString() = it's a special method that all objects inherit
         *              that returns a string that "textually represent" an object
         *              can be used both implicitly or explicitly 
         */
        Cars c1 = new Cars();

        /*prints address of car object: c1, toString 
        method is called implicitly (automatically by the compiler)*/
        System.out.println(c1 + "\n"); 
        
        /*now its called Explicitly (clearly and 
        deliberately specified by the programmer) */
        System.out.println(c1.toString()); 
    }
}
