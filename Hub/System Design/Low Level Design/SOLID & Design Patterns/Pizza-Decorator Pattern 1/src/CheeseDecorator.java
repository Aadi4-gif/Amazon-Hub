public class CheeseDecorator extends pizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }
}
