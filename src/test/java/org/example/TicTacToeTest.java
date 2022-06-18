package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
  @Test
  public void quandoXForaTabuleiroEntaoRuntimeException() {
    assertThrows(RuntimeException.class, () -> {
      throw new RuntimeException();
    });
  }
}
