package edu.harbour.space.university.sam;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class Exercise1 {
    private static final Logger LOGGER= Logger.getLogger(Exercise1.class);
    public static void main(String[] args){
        Function<List<String>,List<String>> function= strings -> {
             for (int i=0; i<strings.size(); i++){
                strings.set(i, strings.get(i).toUpperCase());
             }
             return strings;
        };
        List<String> saman= new ArrayList<>();
        saman.add("asdadadf");
        saman.add("DSDdalad");
        LOGGER.info(function.apply(saman));
    }

}
