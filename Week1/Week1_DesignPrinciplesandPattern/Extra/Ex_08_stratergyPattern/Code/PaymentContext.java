package Week1_DesignPrinciplesandPattern.Extra.Ex_08_stratergyPattern.Code;


public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        if (strategy == null) {
            System.out.println("No payment method selected.");
        } else {
            strategy.pay(amount);
        }
    }
}
