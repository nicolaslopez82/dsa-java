package designpatterns.strategy;

public class App {
    public static void main(String[] args) {
        PaymentCash paymentCash = new PaymentCash();
        paymentCash.pay(10000);
        PaymentCreditCard paymentCreditCard = new PaymentCreditCard();
        paymentCreditCard.pay(20000);
        PaymentDebitCard paymentDebitCard = new PaymentDebitCard();
        paymentDebitCard.pay(30000);
    }
}
