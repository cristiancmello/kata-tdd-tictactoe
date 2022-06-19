package org.example;

public class TicTacToe {
  private Character[][] board = {
    {'\0', '\0', '\0'},
    {'\0', '\0', '\0'},
    {'\0', '\0', '\0'}
  };

  private char lastPlayer = '\0';
  private static final int SIZE = 3;

  public String play(int x, int y) {
    checkAxis(x);
    checkAxis(y);
    lastPlayer = nextPlayer();
    setBox(x, y, lastPlayer);

    if (isWin()) {
      return lastPlayer + " é o vencedor";
    }

    return "Sem vencedor";
  }

  private void checkAxis(int axis) {
    if (axis < 1 || axis > 3) {
      throw new RuntimeException("X esta fora do tabuleiro");
    }
  }

  private void setBox(int x, int y, char lastPlayer) {
    if (board[x - 1][y - 1] != '\0') {
      throw new RuntimeException("Local esta ocupado");
    } else {
      board[x - 1][y - 1] = lastPlayer;
    }
  }

  public char nextPlayer() {
    if (lastPlayer == 'X') {
      return 'O';
    }
    return 'X';
  }

  private boolean isWin() {
    int playerTotal = lastPlayer * 3;

    for (int index = 0; index < SIZE; index++) {
      if (board[0][index] + board[1][index] + board[2][index] == playerTotal) {
        return true;
      } else if (board[index][0] + board[index][1] + board[index][2] == playerTotal) {
        return true;
      }
    }

    if (board[0][0] + board[1][1] + board[2][2] == playerTotal) {
      return true;
    } else if (board[0][2] + board[1][1] + board[2][0] == playerTotal) {
      return true;
    }

    return false;
  }
}
