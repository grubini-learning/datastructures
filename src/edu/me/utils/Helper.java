package edu.me.utils;

public class Helper<T> {
    public static int log2nlz(int bits) {
        if (bits == 0)
            return 0; // or throw exception
        return 31 - Integer.numberOfLeadingZeros(bits);
    }
}
