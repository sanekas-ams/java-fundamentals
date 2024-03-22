package edu.harbour.space.university.sam;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Exercise3 {
    private static final Logger LOGGER = Logger.getLogger(Exercise3.class);
    public static void main(String[] args){
        Function<List<String>, List<String>> function= strings -> {
            for (int i=1; i<strings.size(); i++){
                for (int j=i; j>0; j--){
                    if (strings.get(j).compareTo(strings.get(j-1))<0){
                        Collections.swap(strings,j,j-1);
                    }
                }

            }
            return strings;
        };
        List<String> list= new ArrayList<>();
        list.add("sadadasd");
        list.add("sadaaaaa");
        LOGGER.info(function.apply(list));
    }

}
