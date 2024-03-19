package edu.harbour.space.university.iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        traverseAndPrint(list.iterator());
        traverseAndPrint(set.iterator());
        traverseAndPrint(queue.iterator());
    }

    private static void traverseAndPrint(Iterator<Integer> it) {
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
