public class Main {
    public static void main(String[] args){

//        If there is no object in the class will the static block gets loaded? NO, it will not initialize the static block. The class itself, will not be loaded. If you want to create class irrespective of the object being present, there is a special class in java called "Class". which loads the class.
//        It will throw an exception.
//        Class.forName("Mobile");

        Mobile obj = new Mobile();
        obj.brand = "CMF";
        obj.price = 24000;
        Mobile.name = " ";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 120000;
        Mobile.name = " ";
    }
}