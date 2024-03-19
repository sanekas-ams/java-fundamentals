package edu.harbour.space.university.calculator;

import static edu.harbour.space.university.calculator.Expression.EMPTY_EXPRESSION;

public class InputParser {

    public Expression parseInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            Operator operator = Operator.getBySymbol(input.charAt(i));
            if (operator != Operator.UNKNOWN) {
                String[] parts = input.split(STR."\\\{operator.getSymbol()}");
                return new Expression(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]),
                        operator);
            }
        }
        return EMPTY_EXPRESSION;
    }
}
