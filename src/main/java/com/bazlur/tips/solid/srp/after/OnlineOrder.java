package com.bazlur.tips.solid.srp.after;

import com.bazlur.tips.solid.srp.before.Cart;
import com.bazlur.tips.solid.srp.before.PaymentDetails;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/8/16.
 */
public class OnlineOrder extends Order{
    private NotificationService notificationService;
    private PaymentDetails paymentDetails;
    private PaymentProcessor paymentProcessor;
    private ReservationService reservationService;

    public OnlineOrder(Cart cart, PaymentDetails paymentDetails) {
        super(cart);
        this.paymentDetails = paymentDetails;
        this.notificationService = new NotificatoinServiceImpl();
        this.paymentProcessor = new PaymentProcessorImpl();
        this.reservationService = new ReservationServiceImpl();
    }

    @Override
    public void checkout() {
        paymentProcessor.processCreditCard(paymentDetails, cart.getTotal());
        reservationService.reserveInventory(cart.getItems());
        notificationService.notifyCustomerOrderCreated(cart.getCustomerEmailAddress());
        super.checkout();
    }
}
