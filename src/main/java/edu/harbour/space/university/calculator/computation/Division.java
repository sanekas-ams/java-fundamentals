package edu.harbour.space.university.calculator.computation;

public class Division implements Computation {
    @Override
    public double apply(double number1, double number2) {
        return number1 / number2;
    }
}
