package decorator_design_pattern;

/**
 * @author girishkumarkadambari
 */
public class PizzaWithToppings extends PizzaDecorator{

    public PizzaWithToppings(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void getPizza() {
        pizza.getPizza();
        addToppings();
    }

    private void addToppings() {
        System.out.println("With Toppings.");
    }


}
