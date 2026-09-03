public class Main {
    public static void main(String[] args){
//        Original way String creation, Since it is a class not a datatype(String.java).
        String name = new String("Aadi");
        System.out.println(name);
//        It contains various methods as a class.
        System.out.println(name.charAt(1));
        System.out.println(name.concat("tyan"));

//        Universal way String creation
        String name1 = "Aadi";
//        Immutable
//        here when you are updating the string it is not changing the already existing object for name1, it creates a new object containg the updated data and the address of that object is given to the stack which changes the previous object's address.
        name1=name1+"tyan";
//        here single object is created for n1 and n2 in the heap and gives the same address to the heap since it contains duplicate or constant data. let's say n1-add-101 so it gives the same address to n2-add-101.
        String n1 = "aadi";
        String n2 = "aadi";
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(name1);
        System.out.println(name1.concat("tyan"));
    }
}