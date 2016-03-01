package com.bazlur.tips.calculator;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/17/15.
 */
abstract class MonthByMonthQuantity implements QuantityOfInterest {

    private final double[] values;

    public MonthByMonthQuantity(double[] values) {
        this.values = values;
    }

    @Override
    public double valueAt(int time) {
        return values[time - 1];
    }
}
