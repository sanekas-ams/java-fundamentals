package edu.harbour.space.university.calculator;

import edu.harbour.space.university.calculator.computation.Computation;
import edu.harbour.space.university.calculator.computation.ComputationFactory;

public class CalculatorFacade {
    private final InputReader inputReader;
    private final InputParser inputParser;
    private final ComputationFactory computationFactory;

    public CalculatorFacade(InputReader inputReader,
                            InputParser inputParser,
                            ComputationFactory computationFactory) {
        this.inputReader = inputReader;
        this.inputParser = inputParser;
        this.computationFactory = computationFactory;
    }

    public double run() {
        Expression expression = inputParser.parseInput(inputReader.readInput());
        Computation computation = computationFactory.resolveComputation(expression.getOperator());
        return computation.apply(expression.getNumber1(), expression.getNumber2());
    }
}
