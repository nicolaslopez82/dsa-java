package designpatterns.strategy;

public class PaymentDebitCard implements IPayment {

    @Override
    public void pay(double amount){
        System.out.println("Payment Debit Card");
    }
}
