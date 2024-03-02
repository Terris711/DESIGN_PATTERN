import ObserverDesignPattern.interfaces.Observer;
import ObserverDesignPattern.model.EmailTopic;
import ObserverDesignPattern.model.EmailTopicSubscriber;
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
//public class Main {
//    public static void main (String[] args) {
//        ShoppingCart cart = new ShoppingCart();
//
//        Product pants = new Product(25,"123");
//        Product shirt = new Product(50,"345");
//
//        cart.addProduct(pants);
//        cart.addProduct(shirt);
//
//        // Payment decision
//        cart.pay(new PaypalAlgorithm("vananhduong.vn@gmail.com", "123445"));
//        cart.pay(new CreditCardAlgorithm("vananhduong.vn@gmail.com", "0167727900"));
//
//    }
//}

/* Design Pattern Observer*/

//public class Main {
//    public static void main (String[] args) {
//        EmailTopic topic = new EmailTopic();
//
//        // Create Observer
//        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
//        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
//        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");
//
//        // Register them
//        topic.register(firstObserver);
//        topic.register(secondObserver);
//        topic.register(thirdObserver);
//
//        // attaching observer to subject
//        firstObserver.setSubject(topic);
//
//        // Check for updates
//        firstObserver.update();
//
//        topic.postMessage("Hello Subscriber");
//    }
//}


/* Decorator Design Pattern */
public class Main {
    public static void main (String[] args) {

    }
}