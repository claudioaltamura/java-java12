package de.claudioaltamura.java.java12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

class TeeingExampleTest {

  @Test
  void mean() {
    assertEquals(3.0d, TeeingExample.mean(Stream.of(1, 2, 3, 4, 5)));
  }

}