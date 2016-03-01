package com.bazlur.tips.strategy;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/19/15.
 */
public class Order {
    private final int amount;
    private final PaymentProcessor paymentProcessor;

    public Order(int amount, PaymentProcessor paymentProcessor) {
        this.amount = amount;
        this.paymentProcessor = paymentProcessor;
    }

    public void process() {
        paymentProcessor.execute(amount);
    }
}
