class Mobile {
    static String TYPE;
    String brand;
    int price;
    String name;

    /*
     * static block is called only once;
     * class loading happens first then object instantiation
     */
    static{
        TYPE = "Smartphone";
    }
    public Mobile(){
        brand = "";
        price = 0;
        name = "";
    }

    public void show() {
        System.out.println("TYPE = " + TYPE + "\nBrand = " + brand + "\nName = " + name + "\nPrice = " + price);
    }

    public static void show1() {
        System.out.println("This is a static method");
        /*
        *   Non static member variables can't be accessed in static method 
        *   System.out.println("TYPE = " + TYPE + "\nBrand = " + brand + "\nName = " + name + "\nPrice = " + price);
        */

    }
}

public class Static {
    public static void main(String[] args) throws ClassNotFoundException {


        /*
         * This loads the class in java.
         * Class.forName("")
         */
        Class.forName("Mobile");
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.name = "Iphone 15";
        obj1.price = 130000;
        obj1.show();
        obj1.show1();
        Mobile.show1();
    }

}
