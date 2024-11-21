package org.example;

public class Multiplication {

    public static final long multiplication(int a, int b) {
        return (long) a * b;
    }

    public static final long multiplyUsingLoop(int a, int b) {
        int absB = Math.abs(b);
        long result = 0;
        for (int i = 0; i < absB; i++) {
            result += a;
        }
        return (b < 0) ? -result : result;
    }

    public static final long multiplyUsingRecursion(int a, int b) {
        int absB = Math.abs(b);
        if (absB == 0) {
            return 0;
        }
        long result = a + multiplyUsingRecursion(a, absB - 1);
        return (b < 0) ? -result : result;
    }

    public static final long multiplyUsingShift(int a, int b) {
        long result = 0;
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        while (absB > 0) {
            if ((absB & 1) > 0) {
                result += absA;
            }
            absA <<= 1;
            absB >>= 1;
        }
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }
}
