/* 1. Dolor de Cabeza -> Nada
   2. Dolor de Cabeza + Fiebre -> Gripe
   3. Dolor de Cabeza + Fiebre + Vienes de China-> Coronavirus
*/

#include "stdio.h"

int main(int argc, char const *argv[])
{
    int dolorDeCabeza, fiebre, origenChina; 

    printf("¿Te duele la cabeza?: [1-Si, 0-No]");
    scanf("%d", &dolorDeCabeza);
    if ((dolorDeCabeza != 0) && (dolorDeCabeza != 1))
    {
        printf("Solo son validos los valores 0 o 1");
    }
    else
    {
        printf("¿Tienes fiebre?: [1-Sí, 0-No]");
        scanf("%d", &fiebre);
        if ((fiebre != 0) && (fiebre != 1))
        {
            printf("Solo son validos los valores 0 o 1");
        }
        else
        {
            printf("¿Vienes de china?: [1-Sí, 0-No]");
            scanf("%d", &origenChina);
            if ((fiebre != 0) && (fiebre != 1))
            {
                printf("Solo son validos los valores 0 o 1");
            }
            else
            {
                if (dolorDeCabeza == 0)
                {
                    printf("No tienes nada, a currar vaguete");
                }
                else
                {
                    if (fiebre == 0)
                    {
                        printf("No tienes nada, a currar vaguete");
                    }
                    else
                    {
                        if (origenChina == 0)
                        {
                            printf("Sólo tienes gripe, suertudo");
                        }
                        else
                        {
                            printf("Estás jodido, dale saludos a San Pedro");

                        }
                        
                    }
                }                    
            }
        }
    }
    
    return 0;
}