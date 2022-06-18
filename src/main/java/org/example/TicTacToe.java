package org.example;

public class TicTacToe {
  private Character[][] board = {
    {'\0', '\0', '\0'},
    {'\0', '\0', '\0'},
    {'\0', '\0', '\0'}
  };

  public void play(int x, int y) {
    if (x < 1 || x > 3) {
      throw new RuntimeException("X esta fora do tabuleiro");
    } else if (y < 1 || y > 3) {
      throw new RuntimeException("Y esta fora do tabuleiro");
    }

    if (board[x - 1][y - 1] != '\0') {
      throw new RuntimeException("Espaco ocupado");
    } else {
      board[x - 1][y - 1] = 'X';
    }
  }
}
