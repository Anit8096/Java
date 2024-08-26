public class Cars {
    String Make = "Lamborghini";
    String Model = "Urus";
    int Year = 2022;
    String color = "Blue"; 
    Double Price = 346834.42;

    public String toString() {  // this will be used in file: Java31
        // String myString = Make +"\n" + Model + "\n" + color + "\n" + Year + "\n"; 
        // return myString;    
        //                   OR do it as shown below for simpler approach
        return Make +"\n" + Model + "\n" + color + "\n" + Year + "\n";
    }

    void Start() {
        System.out.println("Engin started");
    }

    void Stop() {
        System.out.println("Engin off");
    }
}
