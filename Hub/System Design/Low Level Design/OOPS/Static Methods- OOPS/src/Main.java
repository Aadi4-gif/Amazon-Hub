public class Main {
//    the  main method should be static inorder to get called, if not main can't be called since you need objects of the Main class which is not possible as the main method consists the object creation process. So it should be static, which makes the method to be called at the time of class loading/creation.
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
// the static method can be called at the point of the class got created/loaded.
        Mobile.show1(obj, obj1);
    }
}