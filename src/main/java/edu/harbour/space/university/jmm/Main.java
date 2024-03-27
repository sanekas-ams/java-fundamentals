package edu.harbour.space.university.jmm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            synchronized (counter) {
                System.out.println(STR."Thread1 initial: \{counter.getI()}");
                counter.inc();
                System.out.println(STR."Thread1: \{counter.getI()}");
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (counter) {
                System.out.println(STR."Thread2 initial: \{counter.getI()}");
                counter.inc();
                System.out.println(STR."Thread2: \{counter.getI()}");
            }
        });
        ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        es.submit(thread1);
        es.submit(thread2);
        es.shutdown();
    }
}
