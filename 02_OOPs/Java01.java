public class Java01 {
    public static void main(String[] args) {
        /*
         * A constructor is a special method that is called when an objet of a 
         * class is initiated/created
         */
        Car c1 = new Car("Mahindra", "XUV500", 2020, "Silver", 1200000D);
        System.out.println(c1.Model);
    }
}

class Car {
    String Make;
    String Model;
    int Year;
    String color; 
    Double Price;

    // Constructor
    Car(String MAKE, String MODEL, int YEAR, String COLOR, Double PRICE) {  
        Make = MAKE;
        Model = MODEL;
        Year = YEAR;
        color = COLOR;
        Price = PRICE;
    }
}
