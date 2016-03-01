package com.bazlur.tips.calculator;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/17/15.
 */
public class DemoCalculatorEngine {

    final static double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[]{42.0, 45.6, 43.0, 50.2, 55.6, 57.7, 58.0, 57.3, 62.0, 60.3, 71.2, 88.8
            };

    public static void main(String[] args) {
        final Sales sales = new Sales(EXPECTED_SALES_JAN_TO_DEC);
        final FixedCosts fixedCosts = new FixedCosts(15.0);
        final IncrementalCosts incrementalCosts = new IncrementalCosts(5.1, 0.15); // intercept and slop of the line
        final Profit profit = new Profit(sales, incrementalCosts, fixedCosts);

        double total = 0.0;
        for (int i = 1; i <= 12; i++) {
            total += profit.valueAt(i);
        }


        System.out.println("Total profit for the  year: " + total);

    }
}
