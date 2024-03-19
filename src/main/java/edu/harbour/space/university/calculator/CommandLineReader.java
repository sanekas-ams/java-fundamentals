package edu.harbour.space.university.calculator;

import java.util.Scanner;

public class CommandLineReader implements InputReader {
    private final Scanner scanner;

    public CommandLineReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readInput() {
        return scanner.nextLine();
    }
}
