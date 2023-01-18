#include <stdio.h>
#include <stdlib.h>

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

    return EXIT_SUCCESS;
}