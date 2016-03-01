package com.bazlur.tips.before;


public class Subtracter extends CalculateBase {
    public Subtracter() {}
    public Subtracter(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);;
    }
}
