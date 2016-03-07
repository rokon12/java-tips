package com.bazlur.tips.solid.srp.after;

import com.bazlur.tips.solid.srp.before.Cart;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/8/16.
 */
public abstract class Order {
    protected Cart cart;

    public Order(Cart cart) {
        this.cart = cart;
    }

    public void checkout() {
        //log do all sort of work here
    }

}
