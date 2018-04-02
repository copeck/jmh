package org.test.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        long start = System.nanoTime();
        String res = list.stream().collect(Collectors.joining(" "));
        long time = System.nanoTime() - start;
        System.out.printf("%.2f ms%n%s%n", time/1_000_000d, res);
    }
}
