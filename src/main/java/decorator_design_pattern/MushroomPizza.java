package decorator_design_pattern;

/**
 * @author girishkumarkadambari
 */
public class MushroomPizza implements Pizza{

    @Override
    public void getPizza() {
        System.out.println("Mushroom Pizza ...");
    }
}
