package com.zadania_nieposortowane.Odwrotna_wiezyczka_z_liczb;

public class Main {

    public static void main(String[] args) {
        int[][] board = new int[6][6];
        board[0] = new int[6];
        board[1] = new int[5];
        board[2] = new int[4];
        board[3] = new int[3];
        board[4] = new int[2];
        board[5] = new int[1];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);

            }
            System.out.println();
        }
    }
}

