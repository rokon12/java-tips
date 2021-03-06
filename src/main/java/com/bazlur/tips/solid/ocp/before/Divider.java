package com.bazlur.tips.solid.ocp.before;


public class Divider extends CalculateBase {
    public Divider() {
    }
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
        ;
    }
}
