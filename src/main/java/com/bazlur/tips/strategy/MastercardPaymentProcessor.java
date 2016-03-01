package com.bazlur.tips.strategy;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/19/15.
 */
public class MastercardPaymentProcessor implements PaymentProcessor {

    @Override
    public void execute(int amount) {
        System.out.println("Executing Mastercard payment: Charging $" + amount);
    }
}
