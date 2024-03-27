package edu.harbour.space.university.calculator;

import edu.harbour.space.university.calculator.computation.ComputationFactory;
import edu.harbour.space.university.calculator.computation.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class CalculatorFacadeTest {
    private final InputReader reader = mock(InputReader.class);
    private final InputParser parser = new InputParser();
    private final ComputationFactory computationFactory = mock(ComputationFactory.class);
    private final CalculatorFacade calculator = new CalculatorFacade(reader, parser, computationFactory);

    @Test
    public void testCalculator() {
        // given
        given(reader.readInput()).willReturn("2+2");
        given(computationFactory.resolveComputation(any())).willReturn(new Sum());

        // when
        double result = calculator.run();

        // then
        assertEquals(4, result);
    }
}
