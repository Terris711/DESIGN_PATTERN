package DecoratorPattern.model;

import DecoratorPattern.interfaces.IceCream;
import DecoratorPattern.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Chocolate Ice-Cream!");
        return 1.0 + super.cost();
    }
}
