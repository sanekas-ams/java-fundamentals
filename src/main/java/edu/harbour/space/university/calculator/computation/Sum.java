package edu.harbour.space.university.calculator.computation;

public class Sum implements Computation {

    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}
