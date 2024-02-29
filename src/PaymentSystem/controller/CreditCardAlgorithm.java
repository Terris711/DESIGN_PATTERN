package PaymentSystem.controller;

public class CreditCardAlgorithm implements Payment {
    private String email;
    private String cardNumber;

    public CreditCardAlgorithm(String email, String cardNumber) {
        this.email = email;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Credit Card");
    }
}
