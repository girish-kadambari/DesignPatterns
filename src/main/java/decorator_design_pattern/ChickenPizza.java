package decorator_design_pattern;

/**
 * @author girishkumarkadambari
 */
public class ChickenPizza implements Pizza{
    @Override
    public void getPizza() {
        System.out.println("Chicken Pizza");
    }
}
