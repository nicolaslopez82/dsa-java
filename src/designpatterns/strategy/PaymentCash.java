package designpatterns.strategy;

public class PaymentCash implements IPayment{

    @Override
    public void pay(double amount) {
        System.out.println("Payment Cash");
    }
}
