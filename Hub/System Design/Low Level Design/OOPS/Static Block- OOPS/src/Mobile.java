public class Mobile {
    String brand;
    int price;
static String name;

//static block, initialized only one time irrespective of no of objects.
    static{
       String  name = "Smart Phone";
        System.out.println("In static block");
    }

    public Mobile(){
        brand =" ";
        price = 0;
        System.out.println("Is in Constructor");
    }

    public void show(){
        System.out.println(brand + " " + price + " " + name + " ");
    }
}
