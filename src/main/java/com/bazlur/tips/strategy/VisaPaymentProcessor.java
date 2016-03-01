package com.bazlur.tips.strategy;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/19/15.
 */
public class VisaPaymentProcessor implements PaymentProcessor {
    @Override
    public void execute(int amount) {
        System.out.println("Executing Visa payment: Charging $ " + amount );
    }
}
