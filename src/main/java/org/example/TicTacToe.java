package org.example;

public class TicTacToe {
  public void play(int x, int y) {
    if (x < 1 || x > 3) {
      throw new RuntimeException("X esta fora do tabuleiro");
    } else if (y < 1 || y > 3) {
      throw new RuntimeException("Y esta fora do tabuleiro");
    }
  }
}
