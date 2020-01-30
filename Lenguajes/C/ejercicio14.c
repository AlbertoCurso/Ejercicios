//JUEGO DE LAS TRES EN RAYA

#include "stdio.h"

void funcion1(int a);
void funcion2(int *a);
void saltoLinea();

void display(int x);

int main(int argc, char const *argv[])
{
    int a1 = 0;
    int a2 = 0;
    float salto = '\n';

    funcion1(a1);
    funcion2(&a2);

    display(a1);
    saltoLinea();
    display(a2); 
    
    return 0;
}

//Paso de parámetros por valor.
void funcion1(int a)
{
    a = 8;
}

//Paso de parámetros por referencia.
void funcion2(int *a)
{
    *a = 8;
}

void display(int x)
{
    printf("%d", x);
}

void saltoLinea()
{
    printf("\n");
}