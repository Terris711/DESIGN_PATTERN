package FactoryDesignPattern.model;

import FactoryDesignPattern.interfaces.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")){
            return new MozambicanCheeseBurger();
        } else if (type.equals("Veggies")) {
            return new MozambicanVeggiesBurger();
        } else return null;
    }
}
