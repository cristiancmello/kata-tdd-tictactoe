package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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

  @Test
  public void quandoLocalOcupadoEntaoRuntimeException() {
    assertThrows(RuntimeException.class, () -> {
      ticTacToe.play(2, 1);
      ticTacToe.play(2, 1);
    });
  }

  @Test
  public void dadaPrimeiraJogadaQuandoProximaJogadaEntaoJogadorX() {
    assertEquals('X', ticTacToe.nextPlayer());
  }

  @Test
  public void dadaUltimaJogadaDeJogadorXQuandoProximaJogadaEntaoJogadorO() {
    ticTacToe.play(1, 1);
    assertEquals('O', ticTacToe.nextPlayer());
  }

  @Disabled
  @Test
  public void dadaUltimaJogadaDeJogadorOQuandoProximaJogadaEntaoJogadorX() {
    ticTacToe.play(1, 1); // vez do Jogador X
    ticTacToe.play(1, 2); // vez do Jogador O

    assertEquals('X', ticTacToe.nextPlayer());
  }

  @Test
  public void quandoJogarEntaoSemVencedor() {
    String actual = ticTacToe.play(1, 1);
    assertEquals("Sem vencedor", actual);
  }

  @Test
  public void quandoJogarETodaLinhaHorizontalEntaoVitoria() {
    ticTacToe.play(1, 1); // X
    ticTacToe.play(1, 2); // O
    ticTacToe.play(2, 1); // X
    ticTacToe.play(2, 2); // O

    String actual = ticTacToe.play(3, 1); // X
    assertEquals("X é o vencedor", actual);
  }

  @Test
  public void quandoJogarETodaLinhaVerticalEntaoVitoria() {
    ticTacToe.play(2, 1);
    ticTacToe.play(1, 1);
    ticTacToe.play(3, 1);
    ticTacToe.play(1, 2);
    ticTacToe.play(2, 2);

    String actual = ticTacToe.play(1, 3);
    assertEquals("O é o vencedor", actual);
  }

  @Test
  public void quandoJogarETodaDiagonalCimaBaixoEntaoVitoria() {
    ticTacToe.play(1, 1);
    ticTacToe.play(1, 2);
    ticTacToe.play(2, 2);
    ticTacToe.play(1, 3);

    String actual = ticTacToe.play(3, 3);
    assertEquals("X é o vencedor", actual);
  }
}
