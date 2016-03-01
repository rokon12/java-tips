package com.bazlur.tips.after;


public class CalculatorEngine {
    private MathProcessable[] handlers;

    public CalculatorEngine(MathProcessable[] handlers) {
        this.handlers = handlers;
    }

    public String process(String statement) {
        // IN: add 1.0 2.0
        // OUT: 1.0 + 2.0 = 3.0

        String[] parts = statement.split(MathProcessable.SEPARATOR);
        String keyword = parts[0]; // add

        MathProcessable theHandler = null;

        for (MathProcessable handler : handlers) {
            if (keyword.equalsIgnoreCase(handler.getKeyword())) {
                theHandler = handler;
                break;
            }
        }

        double leftVal = Double.parseDouble(parts[1]); // 1.0
        double rightVal = Double.parseDouble(parts[2]); // 2.0

        double result = theHandler.doCalculation(leftVal, rightVal);

        return String.valueOf(leftVal) + ' ' + theHandler.getSymbol() + ' ' + rightVal + " = " + result;
    }
}
