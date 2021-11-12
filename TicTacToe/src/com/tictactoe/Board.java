package com.tictactoe;

public class Board {
    private char[][] board = new char[3][3];
    private Boolean turn = true;
    private char player;
    private boolean gameEnded = false;

    public Board() {}

    public boolean isGameEnded() {
        return gameEnded;
    }

    public void setGameEnded(boolean gameEnded) {
        this.gameEnded = gameEnded;
    }

    //inizializzione della board
    public void createBoard() {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    //stampa della board
    public void printBoard() {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void placeChar(int position) {

        //Decidere di chi è il turno
        if(turn == true) {
            player = 'X';
            turn = false;
        } else {
            player = 'O';
            turn = true;
        }

        //Disegna sulla board

        switch (position) {
            case 1 -> board[0][0] = player;
            case 2 -> board[0][1] = player;
            case 3 -> board[0][2] = player;
            case 4 -> board[1][0] = player;
            case 5 -> board[1][1] = player;
            case 6 -> board[1][2] = player;
            case 7 -> board[2][0] = player;
            case 8 -> board[2][1] = player;
            case 9 -> board[2][2] = player;
            default -> {
                break;
            }
        }
    }

    //Controllo vittoria per righe colonne e diagonali
    public void winCondition() {
        for(int i = 0; i < 3; i++) {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                gameEnded = true;
                System.out.println(player + " won");
            }
        }

        for(int j = 0; j < 3; j++) {
            if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                gameEnded = true;
                System.out.println(player + " won");
            }
        }

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            gameEnded = true;
            System.out.println(player + " won");
        }
        if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') {
            gameEnded = true;
            System.out.println(player + " won");
        }
    }
}
