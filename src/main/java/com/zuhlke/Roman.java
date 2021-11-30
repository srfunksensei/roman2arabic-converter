package com.zuhlke;

public enum Roman {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
    private final int value;

    Roman(final int value) {
        this.value = value;
    }

    public int toInt() {
        return value;
    }

    public boolean shouldCombine(final Roman next) {
        return this.value < next.value;
    }
    public int toInt(final Roman next) {
        return next.value - this.value;
    }
}
