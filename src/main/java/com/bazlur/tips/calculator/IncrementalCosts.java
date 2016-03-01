package com.bazlur.tips.calculator;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/17/15.
 */
public class IncrementalCosts extends PolynomialQuantity {


    public IncrementalCosts(final double intercept, double slop) {
        super(new double[]{intercept, slop});
    }

    @Override
    public String getName() {
        return "Incremental Costs";
    }
}
