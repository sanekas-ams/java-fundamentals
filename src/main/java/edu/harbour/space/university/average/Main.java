package edu.harbour.space.university.average;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = List.of(3, 2, 5, 3);
        int sum = 0;
        for (Integer i : a) {
            sum += i;
        }
        System.out.println((double) sum / a.size());
    }
}
