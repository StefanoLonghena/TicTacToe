package com.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int playAgain = 1;
        boolean turn;
        char player;

        while (playAgain == 1) {
            Board b1 = new Board();

            int position;
            int[] check = {-1, -1, -1, -1, -1, -1, -1, -1, -1};

            Scanner scanner = new Scanner(System.in);

            b1.createBoard();

            b1.printBoard();

            while (!b1.isGameEnded()) {

                do {
                    turn = b1.getTurn();

                    if(turn == true) {
                        player = 'X';
                        turn = false;
                    } else {
                        player = 'O';
                        turn = true;
                    }

                    System.out.println("tocca a " + player + ", Inserisci un valore tra 1 e 9 che indica la posizione nella tabella, andando da sinistra verso destra");

                    position = scanner.nextInt();

                    for (int i = 0; i < check.length; i++) {
                        if (check[i] == position) {
                            System.out.println("La casella è già stata occupata");
                            position = 10;
                        }
                    }
                } while (position > 9 || position < 1);


                check[position - 1] = position;

                b1.placeChar(position);
                b1.printBoard();
                b1.winCondition();
            }

            do {
                System.out.println("Vuoi giocare ancora (0=no, 1=sì)?");

                playAgain = scanner.nextInt();
            }while (playAgain != 0 && playAgain != 1);

        }

    }
}
