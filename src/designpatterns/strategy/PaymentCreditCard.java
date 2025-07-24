package designpatterns.strategy;

public class PaymentCreditCard implements IPayment {

    @Override
    public void pay(double amount){
        System.out.println("Payment Credit Card");
    }
}
