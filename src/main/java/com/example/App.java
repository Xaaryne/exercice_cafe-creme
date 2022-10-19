package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Entrez le nombre de pièces de 1 cents que vous possédez:");

        Scanner clavier = new Scanner(System.in);
        int PièceDe1 = clavier.nextInt();

        System.out.println("Entrez le nombre de pièce de 5 que vous possédez:");
        int PièceDe5 = clavier.nextInt();

        System.out.println("Entrez le nombre de pièces de 10 que vous possédez:");
        int PièceDe10 = clavier.nextInt();

        System.out.println("Entrez le nombre de pièces de 20 que vous possédez");
        int PièceDe20 = clavier.nextInt();

        System.out.println("Entrez le nombre de pièces de 50 que vous possédez");
        int PièceDe50 = clavier.nextInt();

        clavier.close();

        int PrixDuCafé = 100;

        PièceDe5 = PièceDe5 * 5;
        PièceDe10 = PièceDe10 * 10;
        PièceDe20 = PièceDe20 * 20;
        PièceDe50 = PièceDe50 * 50;

        int somme = PièceDe1 + PièceDe5 + PièceDe10 + PièceDe20 + PièceDe50;

        int SommeEnMoins = 100 - somme;
        int SommeEnPlus = somme - 100;

        if (somme == PrixDuCafé) {
            System.out.println("Vous avez exactement de quoi payer le café !");
        } else if (somme < PrixDuCafé) {
            System.out.println("Il vous manque " + SommeEnMoins + " centimes");
        } else if (somme > PrixDuCafé) {
            System.out.println("Il vous restera " + SommeEnPlus + " centimes");
        }

    }
}
