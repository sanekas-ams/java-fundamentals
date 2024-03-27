package edu.harbour.space.university.calculator.computation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {
    private final Division division = new Division();

    @Test
    public void testDivision() {
        // given
        double a = 3.0;
        double b = 2.0;

        // when
        double result = division.apply(a, b);

        // then
        assertEquals(1.5, result);
    }

    @Test
    public void testDivisionByZero() {
        // given
        double a = 3.0;
        double b = 0;

        // when
        double result = division.apply(a, b);

        // then
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void testDivisionZeroByZero() {
        // given
        double a = 0;
        double b = 0;

        // when
        double result = division.apply(a, b);

        // then
        assertEquals(Double.NaN, result);
    }
}
