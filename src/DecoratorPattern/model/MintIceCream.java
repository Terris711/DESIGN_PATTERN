package DecoratorPattern.model;

import DecoratorPattern.interfaces.IceCream;
import DecoratorPattern.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice-Cream!");
        return 1.50 + super.cost();
    }
}
