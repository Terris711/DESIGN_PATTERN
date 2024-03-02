package FactoryDesignPattern.interfaces;

import FactoryDesignPattern.model.Hamburger;

public abstract class HamburgerStore {
    SimpleHamburgerFactory factory;

    public Hamburger orderHamburger(String type) {
        Hamburger burger;

        burger = createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }

    abstract public Hamburger createHamburger(String type);
}
