#include "stdio.h"
#define NUMERO_DE_ELEMENTOS 5

int main(int argc, char const *argv[])
{
    //Vector - Arrays
    int numeros[NUMERO_DE_ELEMENTOS];
    int suma = 0;

    for (int i = 0; i < NUMERO_DE_ELEMENTOS; i++) 
    {
        printf("Introduce el numero de la posicion %d:", i);
        scanf("%d", &numeros[i]);
    }

    for (int i = 0; i < NUMERO_DE_ELEMENTOS; i++) 
    {
        suma = suma + numeros[i];
    }

    printf("La suma de las cantidades introducidas es: ");
    printf("%d", suma);
    
    return 0;
}
