public class Main {
    public static void main(String[] args){
        StringBuffer name = new StringBuffer();
//        String buffer will give buffer size which is 16 bytes.
        System.out.println(name.capacity());
        StringBuffer name1 = new StringBuffer("Aadi");
//        Here the string buffer will give extra buffer size of 16bytes, which will avoid relocating memory.
        System.out.println(name1.capacity());
        name1.append("tyan ");
        name1.insert(9, "learns");
        System.out.println(name1);
//        you cannot assign value from a string buffer to string, to do that we have to use a method
//        String n1 = name1; (you can't do this)
        String n1 = name1.toString();
//        String Builder is similar to string Buffer, one difference is string buffer is tread-safe and string builder is not thread-safe.
        StringBuilder name3 = new StringBuilder("Aadi");
        System.out.println(name3.capacity());
        name3.append("tyan ");
        name3.insert(9, "learns");
        System.out.println(name3);
    }
}