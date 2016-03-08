package com.bazlur.tips;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/4/15.
 */
public interface Hello {
    static void main(String[] args) {
        System.out.println("Hello world");
    }

    static void doSomething() {

    }

    void doSomething1();

public class Tuple<X, Y> {
    private X x;
    private Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void showTypes() {
        System.out.println("Type of T is " +
                x.getClass().getName() +
                " and Value: " + x);
        System.out.println("Type of V is " +
                y.getClass().getName() +
                " and Value: " + y);
    }

    public static void main(String[] args) {
        Tuple<String, String> tuple
                = new Tuple<>("Hello", "world");
        tuple.showTypes();

        Tuple<String, Integer> person
                = new Tuple<>("Rahim", 45);
        person.showTypes();


        Tuple<String, Tuple<Integer, Integer>> tupleInsideTuple
                = new Tuple<String, Tuple<Integer, Integer>>("Tuple", new Tuple<Integer, Integer>(45, 89));
    }
}


}
