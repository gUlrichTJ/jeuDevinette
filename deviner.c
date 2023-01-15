#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

// variables globales
int choix = 0;
int max = 0, min = 0, niv1, niv2, niv = 0;
int nombreMystere = 0, nombreDevine = 0;
char reprendre = 'n';


//La fonction srand permet d'initialiser le générateur de nombres pseudoaléatiores avec une graine différente
int niveau()
{
    int premierNiveau = 1, dernierNiveau = 9;
    int tab[9] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    printf("\nNiveau du jeu\n");
    puts("1-Facile (1-100)");
    puts("2-Intermédiaire niveau1(1-500)");
    puts("3-Intermédiaire niveau2(1-1000)");
    puts("4-Intermédiaire niveau3(1-1500)");
    puts("5-Intermédiaire niveau4(1-2000)");
    puts("6-Intermédiaire niveau5(1-3000)");
    puts("7-Intermédiaire niveau6(1-4000)");
    puts("8-Intermédiaire niveau7(1-5000)");
    puts("9-Difficile niveau1(1-25000)");

    putchar('\n');
    do
    {
        printf("\nEntrez votre choix entre %i et %i pour choisir le niveau : ", premierNiveau, dernierNiveau);
        scanf("%i", &choix);


        for (int i = 0; i < dernierNiveau; i++) {
            if (choix == tab[i]) {
                continue;
            }
            else {
                printf("\nSaisie invalide! ");
                reprendre = 'o';
                break;
            }
        }
    }
    while (choix < premierNiveau && choix > dernierNiveau && reprendre == 'o');
    return choix;
}

void deviner2(int min, int max, int niv1, int niv2)
{
    srand(time(NULL));

    if (min == 1 && max == 100)
    {
        puts("\nNIVEAU FACILE\n");
    }
    else if (min == 1 && max == 500)
    {
        puts("\nINTERMÉDIAIRE DE NIVEAU 1\n");
    }
    else if (min == 1 && max == 1000)
    {
        puts("\nINTERMÉDIAIRE DE NIVEAU 2\n");
    }
    else if (min == 1 && max == 1500)
    {
        puts("\nINTERMÉDIAIRE DE NIVEAU 3\n");
    }
    else if (min == 1 && max == 2000)
    {
        puts("\nINTERMÉDIAIRE DE NIVEAU 4\n");
    }
    else if (min == 1 && max == 2500)
    {
        puts("\nDIFFICILE DE NIVEAU 1\n");
    }
    //Génération du nombre mystère
    nombreMystere = (rand() % (max - min + 1)) + min;
    printf("Le nombre deviné se trouve entre %i et %i\n", niv1, niv2);
    printf("%d", nombreMystere);

    do
    {
        do
        {
            printf("Entrez le nombre deviné : ");
            scanf("%d", &nombreDevine);
            if (nombreDevine < niv1 || nombreDevine > niv2)
            {
                printf("Le nombre doit etre compris entre %i et %i", niv1, niv2);
            }
        }
        while (nombreDevine < niv1 && nombreDevine > niv2);
        //Vérification
        if (nombreDevine == nombreMystere)
        {
            puts("Félicitation!!! Vous avez trouvé le nombre mystère");
            break;
        }
        else if (nombreDevine < nombreMystere)
        {
            puts("Entrez un nombre plus grand.");
        }
        else
            puts("Entrez un nombre plus petit.");
        }
    while (nombreDevine != nombreMystere);
}

int main()
{
    //Choix de l'user
    printf("\t\t##############################################");
    puts("\n\t\t##BIENVENU DANS NOTRE PETIT JEU DE DEVINETTE##");
    puts("\t\t##############################################");
    puts("\nEn quoi consiste le jeu? \nL'ordinateur devine un nombre au hasard et vous demande de le "
            "trouver en vous indiquant si le nombre que vous avez entré est plus grand ou plus petit.");
    puts("Il y a plusieurs niveaux en fonction de l'amplitude de l'intervalle dans lequel se trouve le nombre.");


    //Appel du niveau

    reprendre = 'n';
    do{
        niv = niveau();
        switch (niv)
        {
            case 1:
                deviner2(1, 100, 1, 100);
                break;
            case 2:
                deviner2(1, 500, 1, 500);
                break;
            case 3:
                deviner2(1, 1000, 1, 1000);
                break;
            case 4:
                deviner2(1, 1500, 1, 1500);
                break;
            case 5:
                deviner2(1, 2000, 1, 2000);
                break;
            case 6:
                deviner2(1, 3000, 1, 3000);
                break;
            case 7:
                deviner2(1, 4000, 1, 4000);
                break;
            case 8:
                deviner2(1, 5000, 1, 5000);
                break;
            case 9:
                deviner2(1, 25000, 1, 25000);
                break;
            default:
                puts("\n");
            break;
        }
        printf("\nJoueur de nouveau ? (o/n): \n");
        reprendre = getchar();


    } while (reprendre != 'o');


    return (EXIT_SUCCESS);
}
