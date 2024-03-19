package edu.harbour.space.university.calculator;

import edu.harbour.space.university.calculator.computation.Computation;
import edu.harbour.space.university.calculator.computation.ComputationFactory;

import java.util.Scanner;

public class CalculatorFacade {
    private final InputReader inputReader;
    private final InputParser inputParser;
    private final ComputationFactory computationFactory;

    public CalculatorFacade() {
        this.inputReader = new CommandLineReader(new Scanner(System.in));
        this.inputParser = new InputParser();
        this.computationFactory = new ComputationFactory();
    }

    public double run() {
        Expression expression = inputParser.parseInput(inputReader.readInput());
        Computation computation = computationFactory.resolveComputation(expression.getOperator());
        return computation.apply(expression.getNumber1(), expression.getNumber2());
    }
}
