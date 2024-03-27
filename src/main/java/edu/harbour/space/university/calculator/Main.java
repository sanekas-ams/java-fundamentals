package edu.harbour.space.university.calculator;

import edu.harbour.space.university.calculator.computation.ComputationFactory;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        InputReader inputReader = new CommandLineReader(new Scanner(System.in));
        InputParser inputParser = new InputParser();
        ComputationFactory computationFactory = new ComputationFactory();
        CalculatorFacade calculatorFacade = new CalculatorFacade(inputReader, inputParser, computationFactory);
        LOGGER.info(STR."Output: \{calculatorFacade.run()}");
    }
}
