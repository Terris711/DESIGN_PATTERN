package FactoryDesignPattern.model;

public class JamaicanVeggiesBurger extends Hamburger {
    public JamaicanVeggiesBurger() {
        name = "Jamaican Style Veggies Burger";
        sauce = "Spicy Jamaican sauce";
        buns = "Lettuce wrap !";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican style...");
    }
}
