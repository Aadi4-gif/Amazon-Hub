public class Mobile {
    String brand;
    int price;
//    the variable is defined static as it will give the same data to all objects.
    static String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name + " ");
    }
}
