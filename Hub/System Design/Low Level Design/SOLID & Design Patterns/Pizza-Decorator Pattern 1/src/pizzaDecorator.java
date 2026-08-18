public abstract class pizzaDecorator implements Pizza{
    Pizza pizza;

    public pizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
