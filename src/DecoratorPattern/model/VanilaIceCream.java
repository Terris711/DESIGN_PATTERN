package DecoratorPattern.model;

import DecoratorPattern.interfaces.IceCream;
import DecoratorPattern.interfaces.IceCreamDecorator;

public class VanilaIceCream extends IceCreamDecorator {
    public VanilaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Ice-Cream!");
        return 1.0 + super.cost();
    }
}
