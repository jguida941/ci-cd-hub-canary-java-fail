package com.example;

public class BadStyle {
    public static final int bad = 1;

    public int echo(int input) {
        int unused = input + 1;
        return input;
    }
}
