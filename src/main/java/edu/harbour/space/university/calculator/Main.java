package edu.harbour.space.university.calculator;

import edu.harbour.space.university.calculator.computation.Sum;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        InputReader inputReader = new CommandLineReader(new Scanner(System.in));
        InputParser parser = new InputParser();
        Calculator calculator = new Calculator(inputReader, parser);
        LOGGER.info(STR."Output: \{calculator.compute(new Sum())}");
    }
}
