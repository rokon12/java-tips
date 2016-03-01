package com.bazlur.tips.calculator;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/17/15.
 */
public class Sales extends MonthByMonthQuantity {
    public Sales(double[] values) {
        super(values);
    }

    @Override
    public String getName() {
        return "Expected Sales";
    }
}
