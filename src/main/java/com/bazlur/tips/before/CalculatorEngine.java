package com.bazlur.tips.before;


public class CalculatorEngine {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';

    private MathCommand command;
    private double leftValue;
    private double rightValue;
    private double result;

    public void process(String statement) throws InvalidStatementException {
        // add 1.0 2.0
        String[] parts = statement.split(" ");

        if (parts.length != 3) {
            throw new InvalidStatementException("Incorrect number of fields", statement);
        }

        String commandString = parts[0]; // add

        try {
            leftValue = Double.parseDouble(parts[1]); // 1.0
            rightValue = Double.parseDouble(parts[2]); // 2.0
        } catch (NumberFormatException e) {
            throw new InvalidStatementException("Non-numeric data", statement, e);
        }
        setCommandFromString(commandString);
        if (command == null)
            throw new InvalidStatementException("Invalid command", statement);

        CalculateBase calculator = null;
        switch (command) {
            case ADD:
                calculator = new Adder(leftValue, rightValue);
                break;
            case SUBTRACT:
                calculator = new Subtracter(leftValue, rightValue);
                break;
            case MULTIPLY:
                calculator = new Multiplier(leftValue, rightValue);
                break;
            case DIVIDE:
                calculator = new Divider(leftValue, rightValue);
                break;
        }

        calculator.calculate();
        result = calculator.getResult();


    }

    private void setCommandFromString(String commandString) {
        // add -> MathCommand.ADD

        if (commandString.equalsIgnoreCase(MathCommand.ADD.toString())) {
            command = MathCommand.ADD;
        } else if (commandString.equalsIgnoreCase(MathCommand.SUBTRACT.toString())) {
            command = MathCommand.SUBTRACT;
        } else if (commandString.equalsIgnoreCase(MathCommand.MULTIPLY.toString())) {
            command = MathCommand.MULTIPLY;
        } else if (commandString.equalsIgnoreCase(MathCommand.DIVIDE.toString())) {
            command = MathCommand.DIVIDE;
        }
    }

    @Override
    public String toString() {
        // 1.0 + 2.0 = 3.0
        char symbol = ' ';
        switch (command) {
            case ADD:
                symbol = ADD_SYMBOL;
                break;
            case SUBTRACT:
                symbol = SUBTRACT_SYMBOL;
                break;
            case MULTIPLY:
                symbol = MULTIPLY_SYMBOL;
                break;
            case DIVIDE:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        return String.valueOf(leftValue) + ' ' + symbol + ' ' + rightValue + " = " + result;
    }

}
