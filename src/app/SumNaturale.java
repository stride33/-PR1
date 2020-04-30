package app;

import java.util.stream.IntStream;
import java.util.*;

public class SumNaturale {

    public static int[] getInRange(final int min, final int max, final int step) {
        return IntStream.iterate(min, i -> i < max, i -> i + step).toArray();
    }

    public static int Sum(int number) {
        int count = 0;
        int[] numberRange = getInRange(0, number, 1);
        System.out.println(Arrays.toString(numberRange));
        for (int i : numberRange) {
            if ((i % 3 == 0) | (i % 5 == 0)) {
                count += i;
            } else
                continue;
        }
        return count;
    }

    public static void main(final String[] args) {
        System.out.println(Sum(10000));

    }
}