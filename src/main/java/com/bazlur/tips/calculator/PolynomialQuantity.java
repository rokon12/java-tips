package com.bazlur.tips.calculator;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/17/15.
 */
abstract class PolynomialQuantity implements QuantityOfInterest {
    private final double[] coefficients;

    public PolynomialQuantity(double[] coefficients) {
        this.coefficients = coefficients;
    }


    @Override
    public double valueAt(int time) {
        double value = 0.0;

        for (int i = 0; i < coefficients.length; i++) {
            value += coefficients[i] * Math.pow(time, i);
        }

        return value;
    }
}
