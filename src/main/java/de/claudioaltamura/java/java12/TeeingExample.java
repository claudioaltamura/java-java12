package de.claudioaltamura.java.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;

class TeeingExample {

    static double mean(Stream<Integer> stream) {

        return stream.collect(Collectors.teeing(
                summingDouble(i -> i),
                counting(),
                (sum, n) -> sum / n));
    }
}