public class Mobile {
    String brand;
    int price;
//    the variable is defined static as it will give the same data to all objects.
    static String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name + " ");
    }
// You can only use static variable inside a static method (name), instance variables can't be called by the static method (brand, price). But you can do it indirectly by giving access/referencing to the object in the static method and call the static variable by mentioning the obj in the method calling syntax.
    public static void show1(Mobile obj, Mobile obj1){
        System.out.println("Static in use");
        System.out.println(obj.brand + " " + obj.price + " " + name + " ");
        System.out.println(obj1.brand + " " + obj1.price + " " + name + " ");
    }
}
