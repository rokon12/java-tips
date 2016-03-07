package com.bazlur.tips.solid.srp.before;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/7/16.
 */
public class OrderException extends Throwable {
    public OrderException(String message, Exception ex) {
        super(message, ex);
    }
}
