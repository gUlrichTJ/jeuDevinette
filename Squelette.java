package games;

import java.util.InputMismatchException;
import java.util.Scanner;

//Squelette du jeu qui s'affichera au début du jeu
public class Squelette {

    private int choix2 = 0;
    static Scanner sc = new Scanner(System.in);
    
    //Constructor
    public Squelette() {
        selonNiveau();
    }

    //Niveau 1, 2 ou trois pour le jeu
    public static int niveau() {
        int aff1 = 1, aff2 = 3;
        int choix1 = 0;
        System.out.println("1-) Instructions");
        System.out.println("2-) Jeux");
        System.out.println("3-) À propos");

        //Choix de l'utilisateur
        do {
            try {
                System.out.print("Entrez votre choix entre " + aff1 + " et " + aff2 + " : ");
                choix1 = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(sc.next() + " n'est pas un entier.");
            }
        }
        while (choix1 < aff1 || choix1 > aff2);

        return choix1;
    }

    //Partie instructions
    public void instruction() {
        System.out.println("\n\nINTRODUCTION\n");
        System.out.println("\nNous avons trois différents jeux : \n" +
                "1-) Le jeu de calul : dans cette partie, vous choisissez entre l'addition, la " +
                "soustraction, la division, la mulitiplication, le modulo " +
                "(reste de la division entière) ou opération décidée par l'ordinateur où l'ordinateur" +
                " lui-même choisit les opérations à votre place.");
        System.out.println("2-) Le jeu de devinette : dans cette partie, vous devinez un nombre généré " +
                "par l'ordinateur en fonction du niveau que vous avez choisi;");
        System.out.println("3-) Mots mêlés : Un utilisateur entre un mot; l'ordinateur le mélange puis un " +
                "second utilisateur vient deviner le mot mélangé.");

        sc.nextLine();
    }

    //Niveaux des jeux
    public int niveau2() {
        int aff1 = 1, aff2 = 3;
       int choix = 0;

        //Présentation des différents jeux
        System.out.println("\nCette partie présente trois niveaux");
        System.out.println("1-) Jeu de Calcul");
        System.out.println("2-) Jeu de devinette");
        System.out.println("3-) Mots mêlés");
        System.out.println();
        do {
            try {
                System.out.print("Choisissez le jeu que vous voulez entre " +
                        aff1 + " et " + aff2 + " : ");
                choix = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(sc.next() + " n'est pas un entier.");
            }
        }
        while (choix < 1 || choix > 3);

        return choix;
    }

    //Suivant le niveau choisi par l'utilisateur
    public void selonNiveau() {
            switch (niveau()) {

                case 1:
                    //Il faut qu'on montre à nouveau cette page à l'utilisateur
                    instruction();
                    break;
                case 2:
                    switch (niveau2()) {
                        case 1:
                            //Ici nous appelerons la classe CalculMath
                            CalculMath c = new CalculMath();
                            c.selonChoixUtilisateur();
                            break;
                        case 2:
                            //Ici nous appelons la classe Deviner
                            break;
                        case 3:
                            //Ici nous appelons la classe MotMeles
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    //À propos de l'utilisateur
                    break;
                default:
                    break;
            }
    }
}
