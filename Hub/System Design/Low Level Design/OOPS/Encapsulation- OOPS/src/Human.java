public class Human {
//    using "private" Keyword, no external source can access it.
    private int age = 21;
    private String name = "Aadi";
//To assign values to the private parameters, public methods(setter) is used.
    public void setAge(int Age){
        age = Age;
    }

    public void setName(String Name){
        name = Name;
    }
    //To access the private parameters, public methods(getter) inside the class containing the private parameters should be created.
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}
