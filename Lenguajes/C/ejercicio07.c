//ámbitos de variables y bucle for

#include "stdio.h"

int i = 1;

int main(int argc, char const *argv[])
{
    int i = 2;

    for (int i = 0; i < 10; i++)
    {
        printf("FOR: %d\nn", i);
    }

    printf("MAIN: %d\n", i);

    return 0;
}

void mostrar()
{
    printf("GLOBAL: %d\n", i);
}