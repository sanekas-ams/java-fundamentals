package edu.harbour.space.university.calculator;

public enum Operator {
    SUM('+'),
    DIVISION('/'),
    MULTIPLICATION('*'),
    SUBTRACTION('-'),
    UNKNOWN(' ')
    ;

    private final char symbol;

    Operator(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static Operator getBySymbol(char symbol) {
        switch (symbol) {
            case '+' -> {
                return SUM;
            }
            case '-' -> {
                return SUBTRACTION;
            }
            case '/' -> {
                return DIVISION;
            }
            case '*' -> {
                return MULTIPLICATION;
            }
            default -> {
                return UNKNOWN;
            }
        }
    }
}
