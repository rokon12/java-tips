package com.bazlur.tips.calculator;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/17/15.
 */
public class Profit implements QuantityOfInterest {
    private final Sales sales;
    private IncrementalCosts incrementalCosts;
    private FixedCosts fixedCosts;

    public Profit(Sales sales, IncrementalCosts incrementalCosts, FixedCosts fixedCosts) {
        this.sales = sales;
        this.incrementalCosts = incrementalCosts;
        this.fixedCosts = fixedCosts;
    }

    @Override
    public String getName() {
        return "Profit";
    }

    @Override
    public double valueAt(int time) {

        return sales.valueAt(time) - (incrementalCosts.valueAt(time) + fixedCosts.valueAt(time));
    }
}
