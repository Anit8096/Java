public class Java34 {
    public static void main(String[] args) {
        // inheritance = the process where one class acquires,
        // the attributes and methods of another.
        Car_is_a_Vehicle c1 = new Car_is_a_Vehicle();
        System.out.println(c1.Make);
        System.out.println(c1.Model);
        System.out.println(c1.Engin);
        System.out.println(c1.MaxSpeed);
        c1.Start();
    }
}
