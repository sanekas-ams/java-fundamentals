package edu.harbour.space.university.exceptions;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            throw new MyRuntimeException("Number is even");
        } else {
            try {
                processOddNumber(number);
            } catch (MyCheckedException e) {
                LOGGER.error("aklsfn is odd", e);
            } catch (MyCheckedSecondException e2) {
                LOGGER.error(STR."Number is \{number}", e2);
                LOGGER.info("I should have not been executed!");
            }
        }
    }

    private static void processOddNumber(int number) throws MyCheckedException, MyCheckedSecondException {
        if (number == 7) {
            throw new MyCheckedException(STR."Number is odd: \{number}");
        } else {
            throw new MyCheckedSecondException(STR."Snd exception, number: \{number}");
        }
    }
}
