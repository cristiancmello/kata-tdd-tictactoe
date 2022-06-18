package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
  private TicTacToe ticTacToe;

  @BeforeEach
  public final void beforeEach() {
    // Given: criar tabuleiro equivale a instanciar classe TicTacToe onde ficará a representação do mesmo.
    ticTacToe = new TicTacToe();
  }

  @Test
  public void quandoXForaTabuleiroEntaoRuntimeException() {
    assertThrows(RuntimeException.class, () -> {
      ticTacToe.play(5, 2);
    });
  }

  @Test
  public void quandoYForaTabuleiroEntaoRuntimeException() {
    assertThrows(RuntimeException.class, () -> {
      ticTacToe.play(2, 5);
    });
  }
}
