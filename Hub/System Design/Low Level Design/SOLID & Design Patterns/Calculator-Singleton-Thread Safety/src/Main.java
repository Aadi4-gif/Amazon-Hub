void main() {
    //There should be only one objects should be existing throughout.
//    Calculator c1 = Calculator.calculate();
//    Calculator c2 = Calculator.calculate();
//
//    c1.a=5;
//    c1.b=7;
//    c2.a=8;
//    c2.b=4;
//
//    System.out.println(c1.sum());
//    System.out.println(c2.sum());

    Thread t1 = new Thread(() ->{
        Calculator.calculate();
    });

    Thread t2 = new Thread(() ->{
        Calculator.calculate();
    });

    t1.start();
    t2.start();
}