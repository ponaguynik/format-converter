package com.ponagayba.util;

public class DoubleNode<F, S> {

    private final F first;
    private final S second;

    public DoubleNode(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
