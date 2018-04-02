package org.test.string;

import java.util.Arrays;
import java.util.List;

public class ForStringTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        long start = System.nanoTime();
        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 1000; i++) {
            for (String str : list) {
                builder.append(str).append(" ");
            }
//        }
        String res = builder.toString();
        long time = System.nanoTime() - start;
        System.out.printf("%.2f ms%n%s%n", time/1_000_000d, res);
    }
}
