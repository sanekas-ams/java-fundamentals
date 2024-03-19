package edu.harbour.space.university.calculator.computation;

import edu.harbour.space.university.calculator.Operator;

public class ComputationFactory {
    public Computation resolveComputation(Operator operator) {
        return switch (operator) {
            case SUM -> new Sum();
            case DIVISION -> new Division();
            case SUBTRACTION -> new Subtraction();
            case MULTIPLICATION -> new Multiplication();
            case UNKNOWN -> new Unknown();
        };
    }
}
