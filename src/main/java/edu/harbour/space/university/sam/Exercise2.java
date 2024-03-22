package edu.harbour.space.university.sam;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Exercise2 {
    private static final Logger LOGGER = Logger.getLogger(Exercise2.class);
    public static void main(String[] args){
        Function<List<Integer>,List<Integer>> function= integers -> integers.stream()
              .filter(v->v%2==1).toList();
        List<Integer> list=List.of(1,4,5,6,7);
        LOGGER.info(function.apply(list));
        }
    }

