package com.bazlur.tips;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/4/16.
 */
public class Ractangle {
    private int a;
    private int b;

    public Ractangle() {
        System.out.println("Constructiong Ratangle ... ");
    }

    public Ractangle(int a, int b) {
        System.out.println(" contructing ractangle with parameter " + a + ", " + b);
        this.a = a;
        this.b = b;
    }


    public int calculate(int a, int b) {
        return a * b;
    }

    public int calculate(int a) {
        return a * a;
    }

    public int calculate(){
        return a * b;
    }

    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle(1,3);
        ractangle.calculate();


        //int resut1 = ractangle.calculate(4);
        //int result2 = ractangle.calculate(2, 3);
    }
}
