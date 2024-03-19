import edu.harbour.space.university.calculator.Calculator;
import edu.harbour.space.university.calculator.CommandLineReader;
import edu.harbour.space.university.calculator.InputParser;
import edu.harbour.space.university.calculator.InputReader;
import edu.harbour.space.university.calculator.computation.Sum;

import java.util.Scanner;

void main(String[] args) {
    InputReader inputReader = new CommandLineReader(new Scanner(System.in));
    InputParser parser = new InputParser();
    Calculator calculator = new Calculator(inputReader, parser);
    System.out.println(calculator.compute(new Sum()));
}
