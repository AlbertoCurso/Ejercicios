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

    do
    {
        printf("Intentalo con el numero: ");
        scanf("%d", &eleccion);
    } while (aleatorio != eleccion);
    
    printf("ENHORABUENA CRAAAAACK");

    return 0;
}

int getRandom()
{
    int aleatorio;
    srand (time(NULL));
    aleatorio = rand() % NUMERO_MAXIMO;
    return aleatorio;
}