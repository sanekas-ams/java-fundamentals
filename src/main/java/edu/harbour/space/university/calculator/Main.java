package edu.harbour.space.university.calculator;

import edu.harbour.space.university.calculator.computation.Sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new CommandLineReader(new Scanner(System.in));
        InputParser parser = new InputParser();
        Calculator calculator = new Calculator(inputReader, parser);
        System.out.println(calculator.compute(new Sum()));
    }
}
