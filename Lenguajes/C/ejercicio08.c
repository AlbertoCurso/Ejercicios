#include "stdio.h"
#include "stdlib.h"
#include "time.h"

#define VECES 3
#define NUMERO_MAXIMO 10
int getRandom();

int main(int argc, char const *argv[])
{
    int eleccion, i = 0;

    int aleatorio = getRandom();

    printf("el aleatorio es: %d\n", aleatorio);

// quitar
    printf("veces: %d\n", VECES);

    for (i = 0; i < VECES; i++)
    {
        printf("Intentalo con el numero: ");
        scanf("%d", &eleccion);
        
        if (eleccion == aleatorio)
        {
            break;
        }
    }

    if (i >= VECES)
    {
        printf("No lo has conseguido, torpon\n");
    }
    else
    {
        printf("ENHORABUENA CRAAAAACK\n");
    }

    return 0;
}

int getRandom()
{
    int aleatorio;
    srand (time(NULL));
    aleatorio = rand() % NUMERO_MAXIMO;
    return aleatorio;
}