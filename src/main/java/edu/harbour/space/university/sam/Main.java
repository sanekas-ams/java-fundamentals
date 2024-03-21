package edu.harbour.space.university.sam;

import org.apache.log4j.Logger;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Consumer<Double> consumer = aDouble -> {
            LOGGER.info(aDouble);
            LOGGER.info(aDouble);
        };
        consumer.accept(1.0d);

        Function<Double, String> function = aDouble -> {
            LOGGER.info("Bla");
            return STR."Hello from function: \{aDouble}";
        };

        LOGGER.info(function.apply(1.0));

        Predicate<Integer> isOdd = integer -> integer % 2 == 1;

        LOGGER.info(STR."Number 3 is odd: \{isOdd.test(3)}");

        Supplier<Integer> onePlusOne = () -> 1 + 1;

        LOGGER.info(STR."1+1=\{onePlusOne.get()}");

    }
}
