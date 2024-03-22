package edu.harbour.space.university.sam;

import org.apache.log4j.Logger;

import java.util.*;
import java.util.function.Function;

public class Exercise6 {
    private static final Logger LOGGER = Logger.getLogger(Exercise6.class);
    public static void main(String[] args){
        Function<List<String>, Map<String,Integer>> function=new Function<List<String>, Map<String, Integer>>() {
            @Override
            public Map<String, Integer> apply(List<String> strings) {
                 Map <String,Integer> map= new HashMap<>();
                 for (String i: strings){
                     if (map.get(i)==null){
                         map.put(i,1);
                     }else {
                         map.replace(i, map.get(i), map.get(i)+1);
                     }

                 }
                 return map;
            }
        };

        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("aa");
        list.add("aa");
        list.add("bb");
        list.add("bb");
        Map<String,Integer> resultingMap= function.apply(list);
        for (String i: resultingMap.keySet()){
            LOGGER.info("String "+i+" occurs "+resultingMap.get(i)+" time/times.");
        }
    }
}
