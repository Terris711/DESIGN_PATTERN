import PaymentSystem.controller.CreditCardAlgorithm;
import PaymentSystem.controller.PaypalAlgorithm;
import PaymentSystem.controller.ShoppingCart;
import PaymentSystem.model.Product;
import ScoreBoard.controller.ScoreBoard;
import ScoreBoard.controller.ScoreAlgorithmBase;
import ScoreBoard.model.Balloon;
import ScoreBoard.model.Clown;
import ScoreBoard.model.SquareBalloon;

/* ScoreBoard */
//public class Main {
//    public static void main (String[] args) {
//        ScoreBoard scoreBoard = new ScoreBoard();
//
//        System.out.print("Balloon Taps Score: ");
//        scoreBoard.sb = new Balloon();
//        scoreBoard.showScore(10,5);
//
//        System.out.print("Clown Taps Score: ");
//        scoreBoard.sb = new Clown();
//        scoreBoard.showScore(10,5);
//
//        System.out.print("Square Balloon Taps Score: ");
//        scoreBoard.sb = new SquareBalloon();
//        scoreBoard.showScore(10,5);
//    }
//}


/* Payment System */
public class Main {
    public static void main (String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product(25,"123");
        Product shirt = new Product(50,"345");

        cart.addProduct(pants);
        cart.addProduct(shirt);

        // Payment decision
        cart.pay(new PaypalAlgorithm("vananhduong.vn@gmail.com", "123445"));
        cart.pay(new CreditCardAlgorithm("vananhduong.vn@gmail.com", "0167727900"));

    }
}