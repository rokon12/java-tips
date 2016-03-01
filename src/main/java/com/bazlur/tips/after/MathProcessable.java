package com.bazlur.tips.after;


public interface MathProcessable {
    String SEPARATOR = " ";

    String getKeyword(); // add

    char getSymbol(); // +

    double doCalculation(double leftVal, double rightVal);
}
