package behaviouralPattern.strategyPattern;

class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying using UPI");
    }
}

class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying using CreditCard");
    }
}

class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying using DebitCard");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentStrategy upiPaymentStrategy = new UPIPaymentStrategy();
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        PaymentStrategy debitCardPaymentStrategy = new DebitCardPaymentStrategy();

        StrategyPattern strategyPattern = new StrategyPattern();
        strategyPattern.setPaymentStrategy(upiPaymentStrategy);
        strategyPattern.pay();

        strategyPattern.setPaymentStrategy(debitCardPaymentStrategy);
        strategyPattern.pay();

        strategyPattern.setPaymentStrategy(creditCardPaymentStrategy);
        strategyPattern.pay();
    }
}
