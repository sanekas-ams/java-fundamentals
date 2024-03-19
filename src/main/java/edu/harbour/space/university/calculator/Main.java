package edu.harbour.space.university.calculator;

import edu.harbour.space.university.calculator.Calculator;
import edu.harbour.space.university.calculator.computation.Computation;
import edu.harbour.space.university.calculator.computation.ComputationFactory;
import edu.harbour.space.university.calculator.CommandLineReader;
import edu.harbour.space.university.calculator.InputParser;
import edu.harbour.space.university.calculator.InputReader;
import edu.harbour.space.university.calculator.Operator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the expression (e.g., 3 + 4):");
        String expressionInput = scanner.nextLine(); // Read the whole expression input

        // Creating a new Scanner instance with the expressionInput for the CommandLineReader
        InputReader inputReader = new CommandLineReader(new Scanner(expressionInput));
        InputParser parser = new InputParser();
        Calculator calculator = new Calculator(inputReader, parser);

        // Parse the input to get the expression which includes both numbers and the operation
        Expression expression = parser.parseInput(expressionInput);

        // Determine the computation based on the operation in the expression
        Operator operator = expression.getOperator();
        Computation computation = ComputationFactory.resolveComputation(operator);

        // Compute the result using the determined computation
        double result = calculator.compute(computation);
        LOGGER.info(String.format("Output: %f", result));
    }
}

