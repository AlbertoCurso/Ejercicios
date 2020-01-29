#include "stdio.h"
#define MAX_LINEAS 3
#define MAX_COL 5


int main(int argc, char const *argv[])
{
    // 3 categorías, Alimentación, Moda, Juguetes9
    // 5 días de la semana

    int ventas[3][5];
    int fila = 0;
    int col = 0;
    int sumaf2 = 0;
     // Inicializamos la matriz

    for (fila = 0; fila < MAX_LINEAS; fila++)
    {
        for (col = 0; col < MAX_COL; col++)
        {
            ventas[fila][col] = 0;
        }
    }
    
    //Dar valor a algunas celdas
    ventas[0][0] = 10;
    ventas[1][2] = 15;
    ventas[2][3] = 8;
    ventas[2][0] = 31;

    //solicitar las ventas del martes en Alimentación
    printf("Introduce las ventas del martes en Alimentación:");
    scanf("%d", &ventas[0][1]);
    
    // Mostrar toda la matriz
    for (fila = 0; fila < MAX_LINEAS; fila++)
    {
        for (col = 0; col < MAX_COL; col++)
        {
            printf("%d-", ventas[fila][col]);
        }
        printf("\n");
    }

    //Mostrar la suma de la tercera fila (fila 2)    

    fila = 2;

    for (col = 0; col < MAX_COL; col++)
    {
        sumaf2 = sumaf2 + ventas[fila][col];
    }

    printf("la suma de la fila 2 es: %d", sumaf2);

    return 0;

}
