package com.bazlur.tips.calculator;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/17/15.
 */
public interface QuantityOfInterest {

    String getName();


    /**
     * expected value for a particular month
     * @param  time month, 1-12
     * @return expected value
     * */
    double valueAt(final int time);
}
