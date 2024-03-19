package edu.harbour.space.university.calculator.computation;

import edu.harbour.space.university.calculator.Operator;

public class ComputationFactory {

    public static Computation resolveComputation(@org.jetbrains.annotations.NotNull Operator operator) {
        return switch (operator) {
            case SUM -> new Sum();
            case SUBTRACTION -> new Substraction();
            case DIVISION -> new Division();
            case MULTIPLICATION -> new Multiplication();
            default -> throw new IllegalArgumentException(STR."Unknown operator: \{operator}");
        };
    }
}
