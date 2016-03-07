package com.bazlur.tips.solid.srp.after;

import com.bazlur.tips.solid.srp.before.OrderItem;

import java.util.List;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/8/16.
 */
public interface ReservationService {

    void reserveInventory(List<OrderItem> items);
}
