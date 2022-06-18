package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TicTacToeTest {
  private TicTacToe ticTacToe;

  @Test
  public void quandoXForaTabuleiroEntaoRuntimeException() {
    assertThrows(RuntimeException.class, () -> {
      ticTacToe.play(5, 2);
    });
  }
}
