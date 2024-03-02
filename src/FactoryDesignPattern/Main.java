package FactoryDesignPattern;

import FactoryDesignPattern.interfaces.HamburgerStore;
import FactoryDesignPattern.model.Hamburger;
import FactoryDesignPattern.model.JamHamburgerStore;
import FactoryDesignPattern.model.JamaicanCheeseBurger;
import FactoryDesignPattern.model.MozHamburgerStore;

public class Main {
    public static void main(String[] args) {
        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerStore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger(("cheese"));
        System.out.println("Tai Ha orderd: " + hamburger.getName() + "\n");

        hamburger = jamaicanBurgerStore.orderHamburger("Veggies");
        System.out.println("Anna orderd: " + hamburger.getName());
    }
}
