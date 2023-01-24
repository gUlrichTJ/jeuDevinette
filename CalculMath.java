package games;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CalculMath {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    //Constructor
    public CalculMath() {
        
        //test du choix de l'opérateur
        //choixOperateur();
    }

    /**
     * Voici le niveau pour tous les opérateurs*/
    //Niveau facile, intermédiaire ou difficile
    public int niveau() {
        
        int aff1 = 1, aff2 = 3;
        int choix = 0;

        System.out.println("\nVoulez-vous un niveau facile, difficile ou intermédiaire ?\n");
        System.out.println("1-) Facile");
        System.out.println("2-) Intermédiaire");
        System.out.println("3-) Difficile\n");

        do {
            try {
                System.out.print("Faites votre choix entre " + aff1 + " et " + aff2 + " : ");
                choix = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(sc.next() + " n'est pas un entier");
            }
        }
        while (choix < aff1 || choix > aff2);

        return choix;
    }

    /**
     * Cette méthode nous permet d'avoir l'opérateur à utiliser*/
    //choixOperateur.operateur est utile
    public char choixOperateur() {
        
        char choix = 'o';
        System.out.println("\nBIENVENU DANS CE JEU DE CALCUL\n");
        System.out.println("\nVoici les opérateurs dont vous disposez");
        System.out.println("+ pour l'adition");
        System.out.println("- pour la soustraction");
        System.out.println("/ pour la division");
        System.out.println("* pour la multiplication");
        System.out.println("% pour le modulo");
        System.out.println("a pour les opérations décidées par l'utilisateur");
        System.out.println();
        System.out.println("Vous avez le choix entre +, -, /, *, % et a ");
        System.out.println();
        
        do {
            System.out.print("Entrez votre choix : ");
            choix = sc.nextLine().charAt(0);
        }
        while (choix != '+' && choix != '-' && choix != '/' && choix != '*' && choix != '%'
                && choix != 'a');
        //Retour du choix de l'opérateur
        return choix;
    }

    //Nous créons une fonction opérateur pour éviter de répéter les méthodes de calcul.
    public int getCalcul(int nombre1, int nombre2, int operateur) {
        if (operateur == 0) {
            return nombre1 + nombre2;
        } else if (operateur == 1) {
            return nombre1 - nombre2;
        } else if (operateur == 2) {
            return (int) nombre1 / nombre2;
        } else if (operateur == 3) {
            return nombre1 * nombre2;
        } else if (operateur == 4) {
            return nombre1 % nombre2;
        }
        else
            return 0;
    }

    /**Essai de la fonction calculNote*/
    public static void calculNote(int bonnesReponses, int nbQuestions) {

        double note = (double) bonnesReponses / nbQuestions;
        System.out.println(note);
        if (note < 0.5) {
            System.out.println("\nVous pouvez mieux faire.Vous avez " + bonnesReponses + " / " +
                    nbQuestions + "\n");
        } else if (note >= 0.5 && note < 0.8) {
            System.out.println("\nPas mal ! Vous avez " + bonnesReponses + " / " + nbQuestions + "\n");
        } else if (note >= 0.8 && note < 1) {
            System.out.println("\nBien ! Vous avez eu " + bonnesReponses + " / " + nbQuestions + "\n");
        } else {
            System.out.println("\nExcellent ! Vous avez eu " + bonnesReponses + " / " +
                    nbQuestions + "\n");
        }
    }

    //Calcul en fonction de l'opérateur ; cette fonction marche pour tous les opérateurs
    public void calcul(int limite1, int limite2, int limite3, int limite4, int operateur) {
        
        int nombre1 = 0, nombre2 = 0, resultat = 0, resultatUtilisateur = 0;
        int bonneReponse = 0, indiceQuestionCourante = 0, nombreDeQuestions = 10;

        System.out.println("Vous avez à répondre à " + nombreDeQuestions + " questions.\nC'est parti");

        //Nous générons les nombres pseudo-aléatoires
        nombre1 = random.nextInt(limite1, limite2);
        nombre2 = random.nextInt(limite3, limite4);

        //Nous posons la question à l'utilistateur en fonction de l'opérateur
        if (operateur == 0) {   //C'est-à-dire addition
            do {

                //Nous générons les nombres pseudo-aléatoires
                nombre1 = random.nextInt(limite1, limite2);
                nombre2 = random.nextInt(limite3, limite4);

                //Nous stockons la réponse dans une variable résultat
                resultat = getCalcul(nombre1, nombre2, operateur);

                try {
                    System.out.print(nombre1 + " + " + nombre2 + " = ");
                    resultatUtilisateur = sc.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println(sc.next() + " n'est pas un entier");
                }
                if (resultatUtilisateur == resultat) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Parfait");
                    bonneReponse++;
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Incorrect !  La bonne réponse est " + resultat);
                }
                indiceQuestionCourante++;
            }
            while (indiceQuestionCourante < nombreDeQuestions);

            //Calcul de la note
            /**Appel de la fonction calculNote*/
            calculNote(bonneReponse, nombreDeQuestions);
        } else if (operateur == 1) {   //C'est-à-dire soustraction
            do {

                //Nous générons les nombres pseudo-aléatoires
                nombre1 = random.nextInt(limite1, limite2);
                nombre2 = random.nextInt(limite3, limite4);

                //Nous stockons la réponse dans une variable résultat
                resultat = getCalcul(nombre1, nombre2, operateur);

                try {
                    System.out.print(nombre1 + " - " + nombre2 + " = ");
                    resultatUtilisateur = sc.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println(sc.next() + " n'est pas un entier");
                }
                if (resultatUtilisateur == resultat) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Parfait");
                    bonneReponse++;
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Incorrect !  La bonne réponse est " + resultat);
                }
                indiceQuestionCourante++;
            }
            while (indiceQuestionCourante < nombreDeQuestions);

            //Calcul de la note
            /**Appel de la fonction calculNote*/
            calculNote(bonneReponse, nombreDeQuestions);

        } else if (operateur == 2) {   //C'est-à-dire division
            System.out.println("\nDivision entière.");
            do {

                //Nous générons les nombres pseudo-aléatoires
                nombre1 = random.nextInt(limite1, limite2);
                nombre2 = random.nextInt(limite3, limite4);

                //Nous stockons la réponse dans une variable résultat
                resultat = getCalcul(nombre1, nombre2, operateur);

                try {
                    System.out.print(nombre1 + " / " + nombre2 + " = ");
                    resultatUtilisateur = sc.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println(sc.next() + " n'est pas un entier");
                }
                if (resultatUtilisateur == resultat) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Parfait");
                    bonneReponse++;
                } else {
                    try {
                        Toolkit.getDefaultToolkit().beep();
                        Thread.sleep((long) 0.01);
                        Toolkit.getDefaultToolkit().beep();
                        System.out.println("Incorrect !  La bonne réponse est " + resultat);
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
                indiceQuestionCourante++;
            }
            while (indiceQuestionCourante < nombreDeQuestions);

            //Calcul de la note
            /**Appel de la fonction calculNote*/
            calculNote(bonneReponse, nombreDeQuestions);
        }

        else if (operateur == 3) {   //C'est-à-dire multiplication
            do {

                //Nous générons les nombres pseudo-aléatoires
                nombre1 = random.nextInt(limite1, limite2);
                nombre2 = random.nextInt(limite3, limite4);

                //Nous stockons la réponse dans une variable résultat
                resultat = getCalcul(nombre1, nombre2, operateur);

                try {
                    System.out.print(nombre1 + " * " + nombre2 + " = ");
                    resultatUtilisateur = sc.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println(sc.next() + " n'est pas un entier");
                }
                if (resultatUtilisateur == resultat) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Parfait");
                    bonneReponse++;
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Incorrect !  La bonne réponse est " + resultat);
                }
                indiceQuestionCourante++;
            }
            while (indiceQuestionCourante < nombreDeQuestions);

            //Calcul de la note
            /**Appel de la fonction calculNote*/
            calculNote(bonneReponse, nombreDeQuestions);
        }

        else if (operateur == 4) {   //C'est-à-dire modulo
            do {

                //Nous générons les nombres pseudo-aléatoires
                nombre1 = random.nextInt(limite1, limite2);
                nombre2 = random.nextInt(limite3, limite4);

                //Nous stockons la réponse dans une variable résultat
                resultat = getCalcul(nombre1, nombre2, operateur);

                try {
                    System.out.print(nombre1 + " % " + nombre2 + " = ");
                    resultatUtilisateur = sc.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println(sc.next() + " n'est pas un entier");
                }
                if (resultatUtilisateur == resultat) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Parfait");
                    bonneReponse++;
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Incorrect !  La bonne réponse est " + resultat);
                }
                indiceQuestionCourante++;
            }
            while (indiceQuestionCourante < nombreDeQuestions);

            //Calcul de la note
            /**Appel de la fonction calculNote*/
            calculNote(bonneReponse, nombreDeQuestions);
        } else  {
            System.out.println("No we can't");
        }

    }

    //L'utilisateur doit choisir un opérateur
    public void selonChoixUtilisateur() {
        
        //Après avoir choisi l'opérateur, nous lui exposons les niveaux
        switch (choixOperateur()) {
            
            case '+':
                /**Addition*/
                //Lorsque l'utilistateur choisit l'opérateur +, je lui propose les niveaux
                switch (niveau()) {
                    //Il y a trois niveaux
                    case 1:
                        //Niveau facile
                        System.out.println("\nAdditions : faciles\n");
                        calcul(1, 500, 1, 500, 0);
                        break;
                    case 2:
                        //Niveau intermédiaire
                        System.out.println("\nAdditions: Intermédiaire\n");
                        calcul(1, 2000, 1, 2000, 0);
                        break;
                    case 3:
                        //Niveau difficile
                        System.out.println("\nAdditions : Difficile\n");
                        calcul(1, 8000, 1, 8000, 0);
                        break;
                    default:
                        System.out.println("Valeur incorrecte !");
                        break;
                }
                break;
                
            case '-':
                switch (niveau()) {
                    /**Soustraction*/
                    //Nous avons trois niveaux
                    case 1:
                        //Niveau facile
                        System.out.println("\nSoustractions : faciles\n");
                        calcul(300, 700, 1, 500, 1);
                        break;
                    case 2:
                        //Niveau intermédiaire
                        System.out.println("\nSoustractions : Intermédiaire\n");
                        calcul(800, 2000, 1, 1000, 1);
                        break;
                    case 3:
                        //Niveau difficile
                        System.out.println("\nSoustractions : Difficile\n");
                        calcul(2000, 9000, 100, 5000, 1);
                        break;
                    default:
                        System.out.println("Valeur incorrecte !");
                        break;
                }
                break;
                
            case '/':
                /**Division*/

                switch (niveau()) {
                    //Nous avons trois niveaux
                    case 1:
                        //Niveau facile
                        System.out.println("\nDivisions : faciles\n");
                        calcul(300, 700, 1, 500, 2);
                        break;
                    case 2:
                        //Niveau intermédiaire
                        System.out.println("\nDivisions : Intermédiaire\n");
                        calcul(800, 5000, 1, 1000, 2);
                        break;
                    case 3:
                        //Niveau difficile
                        System.out.println("\nDivisions : Difficile\n");
                        calcul(5000, 9000, 100, 2000, 2);
                        break;
                    default:
                        System.out.println("Valeur incorrecte !");
                        break;
                }
                break;
                
            case '*':

                switch (niveau()) {
                    //Nous recevons le niveau de l'utilisateur,
                    //nous avons trois niveaux
                    case 1:
                        //Niveau facile
                        System.out.println("\nMultiplications : faciles\n");
                        calcul(1, 20, 1, 25, 3);
                        break;
                    case 2:
                        //Niveau intermédiaire
                        System.out.println("\nMultiplications : Intermédiaire\n");
                        calcul(10, 100, 20, 100, 3);
                        break;
                    case 3:
                        //Niveau difficile
                        System.out.println("\nMulitiplications : Difficile\n");
                        calcul(100, 500, 150, 500, 3);
                        break;
                    default:
                        System.out.println("Valeur incorrecte !");
                        break;
                }

                break;
                
            case '%':

                switch (niveau()) {
                    //Nous recevons le niveau de l'utilisateur,
                    //nous avons trois niveaux
                    case 1:
                        //Niveau facile
                        System.out.println("\nDivisions : faciles\n");
                        calcul(1, 100, 1, 25, 4);
                        break;
                    case 2:
                        //Niveau intermédiaire
                        System.out.println("\nDivisions : Intermédiaire\n");
                        calcul(10, 100, 20, 100, 4);
                        break;
                    case 3:
                        //Niveau difficile
                        System.out.println("\nDivisions : Difficile\n");
                        calcul(100, 500, 150, 500, 4);
                        break;
                    default:
                        System.out.println("Valeur incorrecte !");
                        break;
                        //Pourquoi ça ne va pas?
                }
            case 'a':

                break;
                
            default:
                
                break;
        }
    }
}
