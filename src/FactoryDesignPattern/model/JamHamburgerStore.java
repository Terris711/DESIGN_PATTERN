package FactoryDesignPattern.model;

import FactoryDesignPattern.interfaces.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")){
            return new JamaicanCheeseBurger();
        } else if (type.equals("Veggies")) {
            return new JamaicanVeggiesBurger();
        } else return null;
    }
}
