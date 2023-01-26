//Forcer l'utilisateur à entrer un chiffre en C

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main() 
{
    char input[100];
    int num;

    printf("Entrez un nombre entier : ");
    fgets(input, sizeof(input), stdin);

    char *endptr;
    num = (int) strtol(input, &endptr, 10);

    if (*endptr != '\n' && *endptr != '\0')
    {
        printf("Vous n'avez pas entré un entier\n");
    }

    //Essai avec isdigit
    printf("Entrez un entier : ");
    fgets(input, sizeof(input), stdin);

    int i;
    for (i = 0; i < strlen(input); i++) {
        if (!isdigit(input[i])) {
            printf("Vous n'avez pas entré un entier\n");
            return EXIT_SUCCESS;
        }
    }

    sscanf(input, "%d", &num);
    printf("Vous avez entré %d\n", num);

    return EXIT_SUCCESS;
}