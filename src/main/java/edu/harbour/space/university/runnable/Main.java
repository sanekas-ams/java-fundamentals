package edu.harbour.space.university.runnable;

public class Main {

    public static void main(String[] args) {
        Object o = new Object();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; ++i) {
                System.out.println(STR."Thread1: \{i}");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        for (int i = 0; i < 1_000_000; ++i) {
            System.out.println(STR."Thread main: \{i}");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
