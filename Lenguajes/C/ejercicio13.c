//JUEGO DE LAS TRES EN RAYA

#include "stdio.h"
#define DIMENSION 3
#define MAXIMA 10

void inicializar();
void mostrarTablero();
int validarInputs(int input);
int validarTresEnRaya();

char tablero[DIMENSION][DIMENSION];
int fila = 0;
int col = 0;

int main(int argc, char const *argv[])
{
    int contador = 0;
    int filaInput = 0;
    int colInput = 0;
    int vter = 0;

    inicializar();
    mostrarTablero();
    printf("\n");

    for (contador = 0; contador < MAXIMA; contador++)
    {
        // Jugada jugador 1
        do
        {
            printf("Haga su jugada jugador 1, fila: ");
            scanf("%d", &filaInput);
        } while (validarInputs(filaInput) != 0);

        do
        {
            printf(", y columna: ");
            scanf("%d", &colInput);
        } while (validarInputs(colInput) != 0);

        // Grabamos el dato y Mostramos Tablero
        tablero[filaInput][colInput] = 'X';
        mostrarTablero();

        if (validarTresEnRaya() == 1)
        {
            printf(" HAS GANADO JUGADOR 1");
            break;
        }

        if (contador >= MAXIMA)
        {
            printf("*** EMPATE ***");
            break;
        }

        // Jugada jugador 2
        do
        {
            printf("Haga su jugada jugador 2, fila: ");
            scanf("%d", &filaInput);
        } while (validarInputs(filaInput) != 0);

        do
        {
            printf(", y columna: ");
            scanf("%d", &colInput);
        } while (validarInputs(colInput) != 0);

        // Grabamos el dato y Mostramos Tablero

        tablero[filaInput][colInput] = 'O';
        mostrarTablero();

        if (validarTresEnRaya() == 2)
        {
            printf(" HAS GANADO JUGADOR 2");
            break;
        }

        if (contador >= MAXIMA)
        {
            printf("*** EMPATE ***");
            break;
        }
    }

    return 0;
}

void inicializar()
{
    for (fila = 0; fila < DIMENSION; fila++)
    {
        for (col = 0; col < DIMENSION; col++)
        {
            tablero[fila][col] = '-';
        }
    }
}

void mostrarTablero()
{
    printf("*** SUPER TRES EN RAYA ****\n");
    printf("  0 1 2\n");
    printf("\n");
    printf("0 ");

    for (fila = 0; fila < DIMENSION; fila++)
    {
        for (col = 0; col < DIMENSION; col++)
        {
            printf("%c ", tablero[fila][col]);
        }
        if (fila < DIMENSION - 1)
        {
            printf("\n");
            printf("\n%d ", fila + 1);
        }
    }
}

int validarInputs(int input)
{
    int control = 0;
    if (input > 2)
    {
        control = -1;
    }
    return control;
}

int validarTresEnRaya()
{
    int contadorX = 0;
    int contadorO = 0;
    int salida = 0;

    // Validamos que se haya hecho 3 en raya en las filas
    for (fila = 0; fila < DIMENSION; fila++)
    {
        for (col = 0; col < DIMENSION; col++)
        {
            if (tablero[fila][col] == 'X')
            {
                contadorX++;
            }
            if (tablero[fila][col] == 'O')
            {
                contadorO++;
            }
        }
        if (contadorX == 3)
        {
            salida = 1;
        }

        if (contadorO == 3)
        {
            salida = 2;
        }
    }

    // Validamos que se haya hecho 3 en raya en las columnas
    if (salida == 0)
    {
        contadorX = 0;
        contadorO = 0;
        fila = 0;
        col = 0;
        for (col = 0; col < DIMENSION; col++)
        {
            for (fila = 0; fila < DIMENSION; fila++)
            {
                if (tablero[fila][col] == 'X')
                {
                    contadorX++;
                }
                if (tablero[fila][col] == 'O')
                {
                    contadorO++;
                }
            }
            if (contadorX == 3)
            {
                salida = 1;
            }

            if (contadorO == 3)
            {
                salida = 2;
            }
        }
    }

    // Validamos que se haya hecho 3 en raya en las diagonales
    if (salida == 0)
    {
        if (((tablero[0][0] == 'X') && (tablero[1][1] == 'X') && (tablero[2][2] == 'X')) ||
            ((tablero[0][2] == 'X') && (tablero[1][1] == 'X') && (tablero[2][0] == 'X')))
        {    
            salida = 1;
        }

        if (((tablero[0][0] == 'O') && (tablero[1][1] == 'O') && (tablero[2][2] == 'O')) ||
            ((tablero[0][2] == 'O') && (tablero[1][1] == 'O') && (tablero[2][0] == 'O')))
        {    
            salida = 2  ;
        }
    }

    return salida;
}