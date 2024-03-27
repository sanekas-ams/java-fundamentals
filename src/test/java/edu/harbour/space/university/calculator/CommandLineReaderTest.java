package edu.harbour.space.university.calculator;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class CommandLineReaderTest {
    private final Scanner scanner = mock(Scanner.class);
    private final CommandLineReader commandLineReader = new CommandLineReader(scanner);

    @Test
    public void testCommandLineReader() {
        // given
        String s = "abc";
        given(scanner.nextLine()).willReturn(s);

        // when
        String result = commandLineReader.readInput();

        // then
        assertEquals(s, result);
    }
}
