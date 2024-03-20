package edu.harbour.space.university.calculator;

import edu.harbour.space.university.calculator.computation.Computation;
import edu.harbour.space.university.calculator.computation.ComputationFactory;

public class Calculator {
    private final InputReader inputReader;
    private final InputParser inputParser;

    public Calculator(InputReader inputReader, InputParser inputParser) {
        this.inputReader = inputReader;
        this.inputParser = inputParser;
    }

    public double compute() {
        Expression expression = inputParser.parseInput(inputReader.readInput());
        ComputationFactory computationFactory=new ComputationFactory();
        Computation computation= computationFactory.resolveComputation(expression.getOperator());
        return computation.apply(expression.getNumber1(), expression.getNumber2());
    }
}
