//Write a simple console-based tic-tac-toe game where two players take turns placing their marks ('X' and 'O') on a 3x3 grid. Use nested loops and conditions to check for a win or draw.

import java.util.Scanner;

public class Tic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        int turn = 0;
        boolean win = false;
        while (turn < 9) {
            if (turn % 2 == 0) {
                System.out.println("Player 1's turn: ");
                System.out.println("Enter the row and column: ");
                int row = sc.nextInt();
                int col = sc.nextInt();
                if (board[row][col] == '-') {
                    board[row][col] = 'X';
                    turn++;
                } else {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }
            } else {
                System.out.println("Player 2's turn: ");
                System.out.println("Enter the row and column: ");
                int row = sc.nextInt();
                int col = sc.nextInt();
                if (board[row][col] == '-') {
                    board[row][col] = 'O';
                    turn++;
                } else {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                    win = true;
                    break;
                }
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                    win = true;
                    break;
                }
            }
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
                win = true;
            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
                win = true;
            }
            if (win) {
                if (turn % 2 == 0) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
                break;
            }
        }
        if (!win) {
            System.out.println("It's a draw!");
        }
        sc.close();
    }
}

