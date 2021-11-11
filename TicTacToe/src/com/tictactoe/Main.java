package com.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board b1 = new Board();

        int position;

        Scanner scanner = new Scanner(System.in);

        b1.createBoard();

        b1.printBoard();

        while(b1.isGameEnded() != true) {

            do {
                position =  scanner.nextInt();
            }while(position > 9 || position < 1);

            b1.placeChar(position);
            b1.printBoard();
            b1.winCondition();
        }



    }
}
