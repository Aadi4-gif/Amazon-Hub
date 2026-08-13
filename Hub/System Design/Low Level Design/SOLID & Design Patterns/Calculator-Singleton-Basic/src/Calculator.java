public class Calculator {
    int a;
    int b;

    private static Calculator obj = new Calculator();

    private Calculator() {

    }

    public int sum(){
        return a+b;
    }

    public static Calculator calculate(){
        return obj;
    }
}
