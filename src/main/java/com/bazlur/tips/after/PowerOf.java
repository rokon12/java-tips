package com.bazlur.tips.after;


public class PowerOf implements MathProcessable {
    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
