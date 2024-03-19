package edu.harbour.space.university.calculator;

public class Expression {

    public static final Expression EMPTY_EXPRESSION = new Expression(0, 0, Operator.UNKNOWN);

    private final double number1;
    private final double number2;
    private final Operator operator;

    public Expression(double number1, double number2, Operator operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public Operator getOperator() {
        return operator;
    }
}
