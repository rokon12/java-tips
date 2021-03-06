package com.bazlur.tips.solid.srp.after;

import com.bazlur.tips.solid.srp.before.PaymentDetails;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/8/16.
 */
public interface PaymentProcessor {
    void processCreditCard(PaymentDetails paymentDetails, double total);
}
