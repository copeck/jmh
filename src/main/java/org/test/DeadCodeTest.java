package org.test;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@Fork(1)
@State(Scope.Thread)
@Warmup(iterations = 2)
@Measurement(iterations = 3)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
public class DeadCodeTest {
    @Benchmark
    public void testMethod1() {
        int a = 1;
        int b = 2;
        int sum = a + b;
    }

    @Benchmark
    public int testMethod2() {
        int a = 1;
        int b = 2;
        return a + b;
    }
}
