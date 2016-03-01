package com.bazlur.tips.strategy;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/19/15.
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order(15, new VisaPaymentProcessor());
        order.process();

        Order order2 = new Order(15, new MastercardPaymentProcessor());
        order2.process();
    }
}
