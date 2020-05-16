package de.claudioaltamura.java.java12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwitchExpressionTest {

  @Test
  void switchExpression() {
    SwitchExpression switchPatternMatching = new SwitchExpression();

    assertEquals("Looks like a Sunday.", switchPatternMatching.day("x"));
  }

}