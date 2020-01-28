/* 1. Dolor de Cabeza -> Nada
   2. Dolor de Cabeza + Fiebre -> Gripe
   3. Dolor de Cabeza + Fiebre + Vienes de China-> Coronavirus
*/

#include "stdio.h"

int main(int argc, char const *argv[])
{
    int idPelicula = 0;

    printf("1. El Irlandes\n");
    printf("2. Origen\n");
    printf("3. El Golpe\n");
    printf("4. Kick Ass\n");
    printf("5. El Padrino\n");

    printf("Introduce el numero de pelicula: ");
    scanf("%d", &idPelicula);
    /*
    if (idPelicula == 1)
    {
        printf("Esta es la pelicula favorita de Miguel Angel");
    }
    else
    {
        if (idPelicula == 2)
        {
            printf("Esta es la pelicula favorita de Alejandro");
        }
        else
        {
            if (idPelicula == 3)
            {
                printf("Esta es la pelicula favorita de Alberto");
            }
            else
            {       
                if (idPelicula == 4)
                {
                    printf("Esta es la pelicula favorita de *******");
                }
                else
                {
                    if (idPelicula == 5)
                    {
                        printf("Esta es la pelicula favorita de ********2");
                    }
                }
            }
        }
    }*/

    switch(idPelicula)
    {
        case 1:
            printf("Esta es la pelicula favorita de Miguel Angel");
            break;

        case 2:
            printf("Esta es la pelicula favorita de Alejandro");
            break;

        case 3:
            printf("Esta es la pelicula favorita de Alberto");
            break;

        case 4:
            printf("Esta es la pelicula favorita de *******");
            break;

        case 5:
            printf("Esta es la pelicula favorita de ********2");
            break;
        
        default:
            printf("Nadie tiene esa pelicula favorita");
    }
    return 0;
}