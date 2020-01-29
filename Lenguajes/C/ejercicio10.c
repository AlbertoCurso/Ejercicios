#include "stdio.h"
#define NUMERO_DE_ELEMENTOS 5

int main(int argc, char const *argv[])
{
    //ALTERNATIVA
    int otrasEdades[] = {10, 15, 35, 28, 18};
    //Vector - Arrays
    int edades[NUMERO_DE_ELEMENTOS];

    edades[0] = 10;
    edades[1] = 15;
    edades[2] = 35;
    edades[3] = 28;
    edades[4] = 18;

    for (int i = 0; i < NUMERO_DE_ELEMENTOS; i++)
    {
        printf("%d\n", edades[i], "%d\n", otrasEdades[i]);
    }
    
    return 0;
}
