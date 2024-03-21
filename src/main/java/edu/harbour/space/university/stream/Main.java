package edu.harbour.space.university.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        Map<String, Integer> processedMap = list.stream()
                .map(v -> v + 2)
                .map(v ->  v * 3)
                // [9, 12, 15]
                // (["9", 14], ["12", 17], ["15", 20])
                .collect(toMap(String::valueOf, i -> i + 5, (i, j) -> i, LinkedHashMap::new));
        System.out.println(processedMap);
    }
}
