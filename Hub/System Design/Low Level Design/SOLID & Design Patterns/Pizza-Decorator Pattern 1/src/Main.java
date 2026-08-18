public class Main {
    public static void main(String[] args){
 Pizza pizza = new Margherittapizza();
        System.out.println("Description: " + pizza.getDescription() + " Cost: " + pizza.getCost());


        pizza = new CheeseDecorator(pizza);
        pizza = new ChickenDecorator(pizza);
        System.out.println("Description: " + pizza.getDescription() + " Cost: " + pizza.getCost());
    }

    
}