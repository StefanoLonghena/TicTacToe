package com.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board b1 = new Board();

        int position;
        int[] check = {-1, -1, -1, -1, -1, -1, -1, -1, -1};

        Scanner scanner = new Scanner(System.in);

        b1.createBoard();

        b1.printBoard();

        while(!b1.isGameEnded()) {

            do {
                System.out.println("Inserisci un valore tra 1 e 9 che indica la posizione nella tabella, andando da sinistra verso destra");

                position =  scanner.nextInt();

                for (int i = 0; i < check.length; i++) {
                    if(check[i] == position) {
                        System.out.println("La casella è già stata occupata");
                        position = 10;
                    }
                }
            }while(position > 9 || position < 1);



            check[position-1] = position;

            b1.placeChar(position);
            b1.printBoard();
            b1.winCondition();
        }



    }
}
