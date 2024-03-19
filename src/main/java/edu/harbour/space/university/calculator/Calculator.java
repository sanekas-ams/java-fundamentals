package edu.harbour.space.university.calculator;

import edu.harbour.space.university.calculator.computation.Computation;

public class Calculator {
    private final InputReader inputReader;
    private final InputParser inputParser;

    public Calculator(InputReader inputReader, InputParser inputParser) {
        this.inputReader = inputReader;
        this.inputParser = inputParser;
    }

    public double compute(Computation computation) {
        Expression expression = inputParser.parseInput(inputReader.readInput());
        return computation.apply(expression.getNumber1(), expression.getNumber2());
    }
}
