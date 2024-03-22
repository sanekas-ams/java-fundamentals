package edu.harbour.space.university.sam;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Exercise5 {
    private static final Logger LOGGER = Logger.getLogger(Exercise5.class);
    public static void main(String[] args){
        Function<List<Integer>,List<Integer>> function= integers -> {
            List<Integer> firstMinLastMax= new ArrayList<>();
            firstMinLastMax.add((integers.stream().min(Comparator.comparing(Integer::valueOf))).get());
            firstMinLastMax.add((integers.stream().max(Comparator.comparing(Integer::valueOf))).get());
            return firstMinLastMax;
        };
        List<Integer> list= List.of(1,2,3,10,9,1,12);
        List<Integer> resultingList=function.apply(list);
        LOGGER.info("Min values is: "+ resultingList.get(0)+ "Max values is: "+ resultingList.get(1)+".");
    }
}
