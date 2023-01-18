package general;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class YovoGame {
    public static void main(String[] args) {

        int usersChoice = 0, usersChoice2 = 0;
        int answer = 0, number1 = 0, number2 = 0, result = 0, number3 = 0;
        int goodAnswerCounter = 0;
        double mark = 0;
        int numberOfQuestions = 0, questionsCounter = 0;
        //Générateur de nombres
        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenu dans notre salle de jeu de maths.\n" +
                "Prenez place pour que nous commencions\n");
        System.out.println("1-Addition\n2-Soustraction\n3-Division\n4-Multiplication");
        System.out.println("5-Modulo\n6-Opération décidée par l'ordinateur");

        //Contrôle du choix de l'utilisateur
        do {
            try {
                System.out.print("\nFaites votre choix entre 1 et 6 svp ");
                usersChoice = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(sc.next() + " n'est pas un entier");
            }

        }
        while (usersChoice < 1 || usersChoice > 6);

        switch (usersChoice) {
            case 1 :
                System.out.println("\tAddition\n");
                System.out.println("1-Facile\n2-Intermédiaire\n3-Difficile");

                do {
                    try {
                        System.out.print("\nFaites votre choix entre 1 et 3 : ");
                        usersChoice2 = sc.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println(sc.next() + " n'est pas entier.");
                    }
                }
                while (usersChoice2 < 1 || usersChoice2 > 3);

                //Suivant que c'est facile, intermédiaire ou difficile
                switch (usersChoice2) {
                    case 1 -> {
                        System.out.println("\tAdditions faciles\n");
                        //Entrée du nombre de questions par l'utilisateur
                        do {
                            try {
                                System.out.print("Combien de questions voulez-vous (5-80) ? ");
                                numberOfQuestions = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas entier.");
                            }
                        }
                        while (numberOfQuestions < 5 || numberOfQuestions > 80);
                        do {
                            //Génération entre deux entiers
                            number1 = random.nextInt(10, 100);
                            number2 = random.nextInt(10, 100);
                            result = number1 + number2;
                            //Affichage de la question
                            try {
                                System.out.print(number1 + " + " + number2 + " = ");
                                answer = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }

                            //Vérification de la réponse
                            if (answer == result) {
                                System.out.println("Correct");
                                goodAnswerCounter++;
                            } else
                                System.out.println("Non ! La bonne réponse est " + result);
                            questionsCounter++;
                        }
                        while (questionsCounter < numberOfQuestions);
                        //Calculation of the mark
                        mark = goodAnswerCounter / numberOfQuestions;
                        if (mark < 0.5) {
                            System.out.println("Oh ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions + " Reprenez pour vous améliorer.");
                        } else if (mark > 0.5 && mark <= 0.7) {
                            System.out.println("Pas mal! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark > 0.7 && mark < 1) {
                            System.out.println("Bien ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark == 1) {
                            System.out.println("Excellent ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else {
                            System.out.println("Passable ! Vous avez eu : " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        }
                    }
                    case 2 -> {
                        //Cas intermédiaire
                        System.out.println("\tAdditions: Intermédiaire\n");
                        //Entrée du nombre de questions par l'utilisateur
                        do {
                            try {
                                System.out.print("Combien de questions voulez-vous (5-80) ? ");
                                numberOfQuestions = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }
                        }
                        while (numberOfQuestions < 5 || numberOfQuestions > 80);
                        do {
                            //Génération entre deux entiers
                            number1 = random.nextInt(100, 500);
                            number2 = random.nextInt(100, 500);
                            result = number1 + number2;
                            //Affichage de la question
                            try {
                                System.out.print(number1 + " + " + number2 + " = ");
                                answer = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }

                            //Vérification de la réponse
                            if (answer == result) {
                                System.out.println("Correct");
                                goodAnswerCounter++;
                            } else
                                System.out.println("Non ! La bonne réponse est " + result);
                            questionsCounter++;
                        }
                        while (questionsCounter < numberOfQuestions);
                        //Calculation of the mark
                        mark = (double) goodAnswerCounter / numberOfQuestions;
                        if (mark < 0.5) {
                            System.out.println("Oh ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions + " Reprenez pour vous améliorer.");
                        } else if (mark > 0.5 && mark <= 0.7) {
                            System.out.println("Pas mal! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark > 0.7 && mark < 1) {
                            System.out.println("Bien ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark == 1) {
                            System.out.println("Excellent ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else {
                            System.out.println("Passable ! Vous avez eu : " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        }
                    }
                    case 3 -> {
                        //Niveau difficile
                        System.out.println("\tAdditions: Difficile\n");
                        //Entrée du nombre de questions par l'utilisateur
                        do {
                            try {
                                System.out.print("Combien de questions voulez-vous (10-100) ? ");
                                numberOfQuestions = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }
                        }
                        while (numberOfQuestions < 10 || numberOfQuestions > 100);
                        do {
                            //Génération des trois entiers
                            number1 = random.nextInt(200, 1000);
                            number2 = random.nextInt(200, 1000);
                            number3 = random.nextInt(200, 1000);
                            result = number1 + number2 + number3;
                            //Contrôle de la saisie de l'utilisateur
                            try {
                                //Affichage de la question
                                System.out.print(number1 + " + " + number2 + " + " + number3 + " = ");
                                //Réponse de l'utilisateur
                                answer = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }

                            //Vérification de la réponse
                            if (answer == result) {
                                System.out.println("Correct");
                                goodAnswerCounter++;
                            } else
                                System.out.println("Incorrect ! La bonne réponse est " + result);
                            questionsCounter++;
                        }
                        while (questionsCounter < numberOfQuestions);
                        //Calculation of the mark
                        mark = (double) goodAnswerCounter / numberOfQuestions;
                        if (mark < 0.5) {
                            System.out.println("Dommage ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions + " Un second essai vous serait d'un bon avantage.");
                        } else if (mark > 0.5 && mark <= 0.7) {
                            System.out.println("Pas mal! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark > 0.7 && mark < 1) {
                            System.out.println("Bien ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark == 1) {
                            System.out.println("Excellent ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else {
                            System.out.println("Passable ! Vous avez eu : " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        }
                    }
                    default -> System.out.println("Valeur incorrecte");
                }
            case 2:
                //Soustractions
                System.out.println("Soustractions");
                System.out.println("1-Facile\n2-Intermédiaire\n3-Difficile");
                do {
                    try {
                        System.out.print("\nFaites votre choix entre 1 et 3 : ");
                        usersChoice2 = sc.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println(sc.next() + " n'est pas entier.");
                    }
                }
                while (usersChoice2 < 1 || usersChoice2 > 3);

                //Suivant que c'est facile, intermédiaire ou difficile
                switch (usersChoice2) {
                    case 1 :
                        System.out.println("\tSoustractions faciles\n");
                        //Entrée du nombre de questions par l'utilisateur
                        do {
                            try {
                                System.out.print("Combien de questions voulez-vous (5-80) ? ");
                                numberOfQuestions = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas entier.");
                            }
                        }
                        while (numberOfQuestions < 5 || numberOfQuestions > 80);

                        do {
                            //Génération entre deux entiers
                            number1 = random.nextInt(10, 150);
                            number2 = random.nextInt(10, 100);
                            result = number1 - number2;
                            //Affichage de la question
                            try {
                                System.out.print(number1 + " - " + number2 + " = ");
                                answer = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }

                            //Vérification de la réponse
                            if (answer == result) {
                                System.out.println("Très bien");
                                goodAnswerCounter++;
                            } else
                                System.out.println("Incorrecte ! La bonne réponse est " + result);
                            questionsCounter++;
                        }
                        while (questionsCounter < numberOfQuestions);
                        //Calculation of the mark
                        mark = goodAnswerCounter/numberOfQuestions;
                        if (mark < 0.5) {
                            System.out.println("Oh ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions + " Reprenez pour vous améliorer.");
                        } else if (mark > 0.5 && mark <= 0.7) {
                            System.out.println("Pas mal! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark > 0.7 && mark < 1) {
                            System.out.println("Bien ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark == 1) {
                            System.out.println("Excellent ! Vous avez eu "+ goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else {
                            System.out.println("Passable ! Vous avez eu : " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        }
                        break;
                    case 2:
                        //Cas intermédiaire
                        System.out.println("\tSoustractions: Intermédiaire\n");
                        //Entrée du nombre de questions par l'utilisateur
                        do {
                            try {
                                System.out.print("Combien de questions voulez-vous (5-80) ? ");
                                numberOfQuestions = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }
                        }
                        while (numberOfQuestions < 5 || numberOfQuestions > 80);

                        do {
                            //Génération entre deux entiers
                            number1 = random.nextInt(100, 500);
                            number2 = random.nextInt(100, 300);
                            result = number1 - number2;
                            //Affichage de la question
                            try {
                                System.out.print(number1 + " - " + number2 + " = ");
                                answer = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }

                            //Vérification de la réponse
                            if (answer == result) {
                                System.out.println("Parfait");
                                goodAnswerCounter++;
                            } else
                                System.out.println("Incorrecte ! La bonne réponse est " + result);
                            questionsCounter++;
                        }
                        while (questionsCounter < numberOfQuestions);
                        //Calculation of the mark
                        try {
                            mark = (double) goodAnswerCounter/numberOfQuestions;
                        } catch (ArithmeticException e) {
                            System.out.println("Impossible d'effectuer la division");
                        }
                        if (mark < 0.5) {
                            System.out.println("Oh ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions + " Reprenez pour vous améliorer.");
                        } else if (mark > 0.5 && mark <= 0.7) {
                            System.out.println("Pas mal! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark > 0.7 && mark < 1) {
                            System.out.println("Bien ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else if (mark == 1) {
                            System.out.println("Excellent ! Vous avez eu "+ goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        } else {
                            System.out.println("Passable ! Vous avez eu : " + goodAnswerCounter + "/" +
                                    numberOfQuestions);
                        }
                        break;
                    case 3:
                        //Niveau difficile
                        System.out.println("\tSoustractions: Difficile\n");
                        //Entrée du nombre de questions par l'utilisateur
                        do {
                            try {
                                System.out.print("Combien de questions voulez-vous (10-100) ? ");
                                numberOfQuestions = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }
                        }
                        while (numberOfQuestions < 10 || numberOfQuestions > 100);

                        do {
                            //Génération des trois entiers
                            number1 = random.nextInt(800, 1500);
                            number2 = random.nextInt(500, 800);
                            number3 = random.nextInt(300, 500);
                            result = number1 - number2 - number3;
                            //Contrôle de la saisie de l'utilisateur
                            try {
                                //Affichage de la question
                                System.out.print(number1 + " - " + number2 + " - " + number3 + " = ");
                                //Réponse de l'utilisateur
                                answer = sc.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println(sc.next() + " n'est pas un entier.");
                            }

                            //Vérification de la réponse
                            if (answer == result) {
                                System.out.println("Parfait");
                                goodAnswerCounter++;
                            } else
                                System.out.println("Incorrect ! La bonne réponse est " + result);
                            questionsCounter++;
                        }
                        while (questionsCounter < numberOfQuestions);
                        //Calculation of the mark
                        mark = (double) goodAnswerCounter/numberOfQuestions;
                        if (mark < 0.5) {
                            System.out.println("Dommage ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions + ". Un second essai vous serait d'un bon avantage.");
                        } else if (mark > 0.5 && mark <= 0.7) {
                            System.out.println("Pas mal! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions + ".");
                        } else if (mark > 0.7 && mark < 1) {
                            System.out.println("Bien ! Vous avez eu " + goodAnswerCounter + "/" +
                                    numberOfQuestions+ ".");
                        } else if (mark == 1) {
                            System.out.println("Excellent ! Vous avez eu "+ goodAnswerCounter + "/" +
                                    numberOfQuestions+ ".");
                        } else {
                            System.out.println("Passable ! Vous avez eu : " + goodAnswerCounter + "/" +
                                    numberOfQuestions+ ".");
                        }
                        break;
                    default:
                        System.out.println("Valeur incorrecte");
                        break;
                }
        }
    }
}
