public class Java27 {
    public static void main(String[] args) {
        //An Object in aa instance of a class that may contain attributes & methods 
        //example: (phone, desk, computer, coffee mug)
        Cars c1 = new Cars();
        System.out.println(c1.Make);
        System.out.println(c1.Model);
        c1.Start();
        c1.Stop();
    }
}
