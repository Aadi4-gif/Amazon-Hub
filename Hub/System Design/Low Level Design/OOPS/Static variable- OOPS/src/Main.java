public class Main {
    public static void main(String[] args){
        Mobile obj = new Mobile();
        obj.brand = "CMF";
        obj.price = 24000;
//        The static variable should be called with the class name, you should not call with object name, you can call with it but not a good implementation.
        Mobile.name = "Smartphone";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 120000;

        Mobile.name = "SmartPhone";
//        Since the variable is staic, it will change the name in every object to 17e.
        Mobile.name = "Phone";

        obj.show();
        obj1.show();
    }
}