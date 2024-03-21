package edu.harbour.space.university.stream;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 2, 3);
        System.out.println(list.stream().reduce(Integer::sum));
    }
}
