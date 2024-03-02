package DecoratorPattern;

import DecoratorPattern.interfaces.IceCream;
import DecoratorPattern.model.BasicIceCream;
import DecoratorPattern.model.MintIceCream;
import DecoratorPattern.model.VanilaIceCream;

public class Main {
    public static void main (String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice Cream costs $" + basicIceCream.cost() + "\n");

        IceCream vanilaIceCream = new VanilaIceCream(basicIceCream);
        System.out.println("Adding Vanilla costs $" + vanilaIceCream.cost() + "\n");

        IceCream mintIceCream = new MintIceCream(vanilaIceCream);
        System.out.println("Adding Mint costs $" + mintIceCream.cost());

    }
}
