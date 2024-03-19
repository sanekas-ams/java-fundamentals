package edu.harbour.space.university.calculator.computation;

public class Unknown implements Computation {
    @Override
    public double apply(double a, double b) {
        return Double.NaN;
    }
}
