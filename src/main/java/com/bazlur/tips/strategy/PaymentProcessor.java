package com.bazlur.tips.strategy;


public interface PaymentProcessor {

    void execute(int amount);
}
