package com.example;

public class UncoveredService {
    public int multiply(int left, int right) {
        return left * right;
    }

    public int subtract(int left, int right) {
        return left - right;
    }

    public int square(int value) {
        return value * value;
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    public int factorial(int value) {
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public int sumRange(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }

    public int max(int left, int right) {
        if (left >= right) {
            return left;
        }
        return right;
    }

    public int min(int left, int right) {
        if (left <= right) {
            return left;
        }
        return right;
    }

    public String repeat(String value, int times) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            builder.append(value);
        }
        return builder.toString();
    }
}
