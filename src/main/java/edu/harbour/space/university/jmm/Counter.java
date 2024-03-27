package edu.harbour.space.university.jmm;

public class Counter {
    private long i = 0;

    long getI() {
        return i;
    }

    long inc() {
        i = i + 1;
        return i;
    }

    long dec() {
        i = i - 1;
        return i;
    }

    void setI(long i) {
        this.i = i;
    }
}
