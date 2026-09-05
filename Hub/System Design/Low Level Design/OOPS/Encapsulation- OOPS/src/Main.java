public class Main {
    public static void main(String[] args){
   Human Aadi = new Human();
//   Assigning parameters.
   Aadi.setAge(21);
   Aadi.setName("Aadi");
//   Accessing the private parameters through public methods.
        System.out.println(Aadi.getName() +" "+ Aadi.getAge());

    }
}