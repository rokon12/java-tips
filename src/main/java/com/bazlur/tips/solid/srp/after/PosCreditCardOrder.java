package com.bazlur.tips.solid.srp.after;

import com.bazlur.tips.solid.srp.before.Cart;
import com.bazlur.tips.solid.srp.before.PaymentDetails;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/8/16.
 */
public class PosCreditCardOrder extends Order {
    private PaymentDetails paymentDetails;
    private PaymentProcessor paymentProcessor;

    public PosCreditCardOrder(Cart cart, PaymentDetails paymentDetails) {
        super(cart);
        this.paymentDetails = paymentDetails;
        this.paymentProcessor = new PaymentProcessorImpl();
    }

    @Override
    public void checkout() {
        paymentProcessor.processCreditCard(paymentDetails, cart.getTotal());
        super.checkout();
    }
}
