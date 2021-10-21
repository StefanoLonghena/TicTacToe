package es25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci l'eta");
        p1.setEtà(scanner.nextInt());

        System.out.println("Inserisci nome");
        p1.setNome(scanner.nextLine());

        System.out.println("Inserisci professione");
        p1.setProfessione(scanner.nextLine());

        System.out.println("Inserisci il sesso");
        p1.setSesso(scanner.nextLine());


        p1.chiSei(p1.getNome(), p1.getSesso(), p1.getEtà(), p1.getProfessione());


    }
}
