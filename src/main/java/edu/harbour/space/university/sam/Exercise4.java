package edu.harbour.space.university.sam;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.function.Function;

public class Exercise4 {
    private static final Logger LOGGER = Logger.getLogger(Exercise4.class);
    public static void main(String[] args){
        Function<List<Integer>,Long> function= integers -> integers.stream().filter(v->v%2==0).mapToLong(Integer::longValue).sum();
       List<Integer> list=List.of(3,5,4,2,1,8,10);
        LOGGER.info(function.apply(list));
    }
}
