package com.bazlur.tips.after;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/19/15.
 */
public class Main {
    public static void main(String[] args) {
        String[] statements = {
                "add 25.0 92.0",       // 25.0 + 92.0 = 117.0
                "power 5.0 2.0"        // 5.0 ^ 2.0 = 25.0
        };

        CalculatorEngine engine = new CalculatorEngine(new MathProcessable[]{
                new Adder(),
                new PowerOf()
        });

        for (String statement : statements) {
            String output = engine.process(statement);
            System.out.println(output);
        }
    }
}
