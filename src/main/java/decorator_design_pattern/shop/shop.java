package decorator_design_pattern.shop;

import decorator_design_pattern.*;

/**
 * @author girishkumarkadambari
 */
public class shop {

    public  static  void main(String args[]){

        System.out.println("Customer :1..");
        Pizza chickenPizza = new ChickenPizza();
        chickenPizza.getPizza();
        System.out.println("");

        System.out.println("Customer :2..");
        Pizza mushroom = new MushroomPizza();
        mushroom.getPizza();
        System.out.println("");


        System.out.println("Customer :3..");
        Pizza chickenPizzaWithTopping = new PizzaWithToppings(new ChickenPizza());
        chickenPizzaWithTopping.getPizza();
        System.out.println("");

    }

}
