package decorator_design_pattern;

/**
 * @author girishkumarkadambari
 */
public  abstract  class PizzaDecorator implements Pizza{

    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public void getPizza() {
        this.pizza.getPizza();
    }
}
