package org.example;

public class TicTacToe {
  private Character[][] board = {
    {'\0', '\0', '\0'},
    {'\0', '\0', '\0'},
    {'\0', '\0', '\0'}
  };

  public void play(int x, int y) {
    checkAxis(x);
    checkAxis(y);
    setBox(x, y);
  }

  private void checkAxis(int axis) {
    if (axis < 1 || axis > 3) {
      throw new RuntimeException("X esta fora do tabuleiro");
    }
  }

  private void setBox(int x, int y) {
    if (board[x - 1][y - 1] != '\0') {
      throw new RuntimeException("Local esta ocupado");
    } else {
      board[x - 1][y - 1] = 'X';
    }
  }
}
