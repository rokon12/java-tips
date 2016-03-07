package com.bazlur.tips.solid.srp.before;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/7/16.
 */
public class Cart {
    private List<OrderItem> items;
    private String customerEmailAddress;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addOrder(OrderItem orderItem) {
        items.add(orderItem);
    }

    public double getTotal() {

        return items.stream()
                .map(orderItem -> orderItem.getPrice() * orderItem.getQuantity())
                .reduce(0.0, Double::sum);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }
}
