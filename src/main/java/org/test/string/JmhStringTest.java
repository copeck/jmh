package org.test.string;

import org.openjdk.jmh.annotations.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Fork(1)
@State(Scope.Thread)
@Warmup(iterations = 2)
@Measurement(iterations = 3)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class JmhStringTest {
    public List<String> list = Arrays.asList("a", "b", "c", "d");

    @Benchmark
    public String listToString() {
        StringBuilder builder = new StringBuilder();
        for (String str : list) {
            builder.append(str).append(" ");
        }
        return builder.toString();
    }

    @Benchmark
    public String streamToString() {
        return list.stream().collect(Collectors.joining(" "));
    }

    @Benchmark
    public String concatToString() {
        return "a" + " " + "b" + " " + "c" + " " + "d";
    }
}
