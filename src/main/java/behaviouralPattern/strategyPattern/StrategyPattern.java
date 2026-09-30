package behaviouralPattern.strategyPattern;

public class StrategyPattern {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay() {
        paymentStrategy.pay();
    }
}
