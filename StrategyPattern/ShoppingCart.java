package DesignPattern.StrategyPattern;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount) {
        this.paymentStrategy.pay(amount);
    }
}
