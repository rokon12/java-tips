package com.bazlur.tips.calculator;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/17/15.
 */
public class FixedCosts extends PolynomialQuantity {

    public FixedCosts(double coefficient) {
        super(new double[]{coefficient});
    }

    @Override
    public String getName() {
        return "Fixed Costs";
    }
}
