public class ChickenDecorator extends pizzaDecorator{
    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Chicken";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 150;
    }
}
