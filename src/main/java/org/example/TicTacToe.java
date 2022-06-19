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

    if (isWin(x, y)) {
      return lastPlayer + " é o vencedor";
    } else if (isDraw()) {
      return "O jogo empatou";
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

  private boolean isWin(int x, int y) {
    int playerTotal = lastPlayer * 3;
    char diagonal1, diagonal2, horizontal, vertical;
    diagonal1 = diagonal2 = horizontal = vertical = '\0';

    for (int index = 0; index < SIZE; index++) {
      diagonal1 += board[index][index];
      diagonal2 += board[index][SIZE - index - 1];
      horizontal += board[index][y - 1];
      vertical += board[x - 1][index];

      if (board[0][index] + board[1][index] + board[2][index] == playerTotal) {
        return true;
      } else if (board[index][0] + board[index][1] + board[index][2] == playerTotal) {
        return true;
      }
    }

    if (diagonal1 == playerTotal
      || diagonal2 == playerTotal
      || horizontal == playerTotal
      || vertical == playerTotal) {
      return true;
    }

    return false;
  }

  private boolean isDraw() {
    for (int x = 0; x < SIZE; x++) {
      for (int y = 0; y < SIZE; y++) {
        if (board[x][y] == '\0') {
          return false;
        }
      }
    }

    return true;
  }
}
